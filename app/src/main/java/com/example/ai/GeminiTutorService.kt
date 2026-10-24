package com.example.ai

import com.example.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

object GeminiTutorService {
    private val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private const val MODEL_NAME = "gemini-3.5-flash"
    private const val BASE_URL = "https://generativelanguage.googleapis.com/v1beta/models/$MODEL_NAME:generateContent"

    fun isKeyValid(key: String): Boolean {
        return key.isNotBlank() && key != "MY_GEMINI_API_KEY"
    }

    val isApiKeyConfigured: Boolean
        get() = isKeyValid(BuildConfig.GEMINI_API_KEY)

    // Curated offline responses for popular learner queries
    private val offlineSmartAnswers = mapOf(
        "veg" to "Namaste! Vietnam me vegetarian khana bohot popular hai. Buddhist tradition ki wajah se lagbhag har jagah 'Quán Chay' (Veg food stall) milte hain.\n\nTips for Indian Vegans & Vegetarians:\n1. 'Tôi ăn chay' (Un chai) = Main veg hoon\n2. 'Không thịt' = Meat mat daalna\n3. 'Không nước mắm' (Khawng nu-uk maam) = Fish sauce mat daalna! Yeh sabse zaroori sentence hai.\n4. Dishes to try: Phở chay (noodle soup), Bánh mì chay (tofu sandwich), Đậu sốt cà chua (Paneer jaisa tofu tomato curry).",
        "tones" to "Vietnamese ke 6 tones ko Indian sounds se aise samjhein:\n\n1. Thanh Ngang: Normal flat voice jaise 'Haan'.\n2. Thanh Huyền (`): Gentle falling pitch jaise hum bolte hain 'Achaa...'\n3. Thanh Sắc (´): High rising pitch jaise 'KAHAN?' ya 'KYA?'\n4. Thanh Hỏi (?): Questioning dip fir rise jaise 'Sach mein?'\n5. Thanh Ngã (~): Gale me halka break/glottal hiccup jaise 'Na-ah!'\n6. Thanh Nặng (.): Sudden low drop with cut-off jaise gusse me 'Ruk!' ya 'Hat!'\n\nDaily 5 minute aaine ke samne practice kijiye!",
        "pronouns" to "Vietnamese me 'I' aur 'You' bolna rude lagta hai. India ki tarah yahan relationship-based pronouns hain:\n\n- Anh = Thoda bada ladka (Bhaiya)\n- Chị = Badi ladki (Didi)\n- Em = Chhota bhai ya behen (Junior)\n- Chú = Papa ki umar ke uncle (Chachaji)\n- Cô = Aunty ya teacher\n- Bác = Tauji ya Dada ji ki umar ke buzurg\n\nGolden rule: Agar aap kisi ko 'Anh' bolenge, toh khud ko 'Em' bolein!",
        "slang" to "Top Vietnamese young slang words:\n1. 'Chém gió' (literally: hawa katna) = Gappe marna / Chill gossip\n2. 'Bó tay' = Main haar gaya / Meri samajh se bahar hai (I give up!)\n3. 'Trời ơi!' = Are baap re! / Oh my god!\n4. 'Dzô!' = Cheers! (Roadside dhabon par chillate hain)\n5. 'Trăm phần trăm' (100%) = Bottoms up!",
        "bargain" to "Bargaining Masterclass for Ben Thanh & Dong Xuan Market:\n\n1. Pehle smile karke daam poochein: 'Cái này bao nhiêu tiền?'\n2. Daam sunte hi boliye: 'Trời ơi, đắt quá!' (Are baap re, bohot mehenga hai!)\n3. Fir bolo: 'Bớt được không chị?' (Thoda discount milega didi?)\n4. Quote around 50-60% of original price politely: 'Một trăm nghìn được không?' (100k Dong me doge kya?)\n5. Agar nahi maanein, toh walk away karein; 80% sellers aapko bula lenge!"
    )

    suspend fun askTutor(userQuery: String, overrideApiKey: String? = null): String = withContext(Dispatchers.IO) {
        val apiKey = if (!overrideApiKey.isNullOrBlank()) overrideApiKey else BuildConfig.GEMINI_API_KEY
        if (!isKeyValid(apiKey)) {
            // Intelligent offline fallback
            val lower = userQuery.lowercase()
            return@withContext when {
                lower.contains("veg") || lower.contains("food") || lower.contains("chay") || lower.contains("paneer") ->
                    offlineSmartAnswers["veg"]!!
                lower.contains("tone") || lower.contains("awaaz") || lower.contains("sound") || lower.contains("pitch") ->
                    offlineSmartAnswers["tones"]!!
                lower.contains("pronoun") || lower.contains("anh") || lower.contains("chi") || lower.contains("bhaiya") ->
                    offlineSmartAnswers["pronouns"]!!
                lower.contains("slang") || lower.contains("cool") || lower.contains("dzo") ->
                    offlineSmartAnswers["slang"]!!
                lower.contains("bargain") || lower.contains("market") || lower.contains("shopping") || lower.contains("price") ->
                    offlineSmartAnswers["bargain"]!!
                else ->
                    "Namaste dost! Main VietGuru hoon - aapka Vietnamese learning buddy. " +
                            "Mujhse Vietnamese tones, vegetarian food, bargaining, ya cultural etiquette ke baare me pooch sakte hain!\n\n" +
                            "(Tip: Live AI queries ke liye AI Studio ke Secrets panel me 'GEMINI_API_KEY' add kar sakte hain. Par offline mode me bhi saari lessons aur smart answers 100% free kaam karte hain!)"
            }
        }

        try {
            val systemInstruction = "You are VietGuru, an expert Vietnamese language tutor specially designed for Indian learners who understand Hinglish written in Roman script (NOT Devanagari Hindi). " +
                    "Explain Vietnamese pronunciation, grammar, culture, and phrases using relatable Indian cultural analogies (e.g. comparing pronouns to Bhaiya/Didi/Chacha, comparing food to Indian dishes like paneer, street bargaining like Sarojini Nagar). " +
                    "Always provide Vietnamese spelling with correct diacritics, Roman phonetic pronunciation guide, and natural Hinglish explanation. Keep answers friendly, encouraging, and concise."

            val jsonBody = JSONObject().apply {
                val contentsArray = JSONArray().apply {
                    put(JSONObject().apply {
                        put("parts", JSONArray().apply {
                            put(JSONObject().apply {
                                put("text", "$systemInstruction\n\nUser Question: $userQuery")
                            })
                        })
                    })
                }
                put("contents", contentsArray)
            }

            val request = Request.Builder()
                .url("$BASE_URL?key=$apiKey")
                .post(jsonBody.toString().toRequestBody("application/json".toMediaType()))
                .build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string() ?: ""

            if (!response.isSuccessful) {
                return@withContext "AI service se connect nahi ho paya. Offline tip: ${offlineSmartAnswers["tones"]}"
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            val candidate = candidates?.optJSONObject(0)
            val content = candidate?.optJSONObject("content")
            val parts = content?.optJSONArray("parts")
            val text = parts?.optJSONObject(0)?.optString("text")

            text ?: "VietGuru abhi answer generate nahi kar paya. Please retry kijiye!"
        } catch (e: Exception) {
            "Error: ${e.localizedMessage ?: "Connection error"}. Par aap offline lessons aur quiz continue kar sakte hain!"
        }
    }
}
