package com.example.data.repository

import com.example.data.model.ToneExample
import com.example.data.model.ToneGuide

object ToneData {
    val allTones = listOf(
        ToneGuide(
            id = "ngang",
            name = "Thanh Ngang (Flat Tone)",
            diacriticSymbol = "a (No mark)",
            toneType = "Mid Level Flat",
            pitchTrend = "44 - Flat & steady",
            descriptionHinglish = "Bilkul seedhi, normal awaaz. Pitch na upar jati hai na neeche.",
            indianAnalogy = "Jaise Hindi me aam bolchal me 'Haan' ya 'Kal' bolte hain bina kisi jazbaat ke, flat aur relaxed.",
            sampleWord = "Ma",
            sampleMeaning = "Bhoot (Ghost)",
            samplePhonetic = "Maa (seedha bolo)",
            commonMistake = "Indian speakers aksar aakhri sound ko stretch kar dete hain. Ise natural rakhein.",
            examples = listOf(
                ToneExample("Ba", "Baa", "Pita (Father) ya Number 3", "Ngang"),
                ToneExample("Ăn", "Unn", "Khaana (To eat)", "Ngang"),
                ToneExample("Đi", "Dee", "Jaana (To go)", "Ngang")
            )
        ),
        ToneGuide(
            id = "huyen",
            name = "Thanh Huyền (Falling Tone)",
            diacriticSymbol = "à (Grave accent `)",
            toneType = "Low Falling",
            pitchTrend = "31 - Gentle downward glide",
            descriptionHinglish = "Awaaz halke se neeche girti hai. Deep, soft aur relaxed tone hoti hai.",
            indianAnalogy = "Jab koi baat samajh aati hai aur hum bolte hain 'Achaa...' (neeche girti awaaz), bilkul wahi gentle descent.",
            sampleWord = "Mà",
            sampleMeaning = "Lekin / Par (However / But)",
            samplePhonetic = "Maa (girti hui awaaz)",
            commonMistake = "Zyaada heavy mat kijiye, yeh bohot gentle falling tone hai.",
            examples = listOf(
                ToneExample("Bà", "Baa (falling)", "Dadi / Nani (Grandmother)", "Huyền"),
                ToneExample("Cà phê", "Caa fey", "Coffee", "Huyền"),
                ToneExample("Nhà", "Nyah (falling)", "Ghar (House)", "Huyền")
            )
        ),
        ToneGuide(
            id = "sac",
            name = "Thanh Sắc (Rising Tone)",
            diacriticSymbol = "á (Acute accent ´)",
            toneType = "High Rising",
            pitchTrend = "35 - Fast upward climb",
            descriptionHinglish = "Awaaz tezi se upar chadh-ti hai. Energetic aur sharp sound.",
            indianAnalogy = "Jaise jab Mummy door se poochti hain 'KAHAN?' ya 'KYA?', aakhri pitch jo sharp upar jati hai.",
            sampleWord = "Má",
            sampleMeaning = "Mummy (South) ya Gaal (Cheek)",
            samplePhonetic = "Máa (upar jaati pitch)",
            commonMistake = "Tone ko lamba mat kheecho, yeh quick aur high-pitched hoti hai.",
            examples = listOf(
                ToneExample("Cá", "Cáa", "Machhli (Fish)", "Sắc"),
                ToneExample("Có", "Caw (rising)", "Hona / Yes (Have / Yes)", "Sắc"),
                ToneExample("Nóng", "Nawng (rising)", "Garam (Hot)", "Sắc")
            )
        ),
        ToneGuide(
            id = "hoi",
            name = "Thanh Hỏi (Dipping-Rising Tone)",
            diacriticSymbol = "ả (Hook mark ?)",
            toneType = "Dipping then Rising",
            pitchTrend = "313 - Down then up",
            descriptionHinglish = "Awaaz pehle thodi neeche aati hai, fir question ki tarah halki si upar chadh jaati hai.",
            indianAnalogy = "Jaise shaq hone par hum bolte hain 'Sach me?' ya 'Kyun?'. Awaaz me natural question mark hota hai.",
            sampleWord = "Mả",
            sampleMeaning = "Qabar (Tomb)",
            samplePhonetic = "Maa? (halka dip fir rise)",
            commonMistake = "Huyền (falling) aur Hỏi me log confuse hote hain; Hỏi me aakhri me upward inflection zaroor aana chahiye.",
            examples = listOf(
                ToneExample("Phở", "Fuh? (dipping)", "Mashhoor Vietnamese Noodle Soup", "Hỏi"),
                ToneExample("Cảm ơn", "Kaam? un", "Dhanyawad (Thank you)", "Hỏi"),
                ToneExample("Hỏi", "Hoy?", "Poochna (To ask)", "Hỏi")
            )
        ),
        ToneGuide(
            id = "nga",
            name = "Thanh Ngã (High Broken Glottal Tone)",
            diacriticSymbol = "ã (Tilde mark ~)",
            toneType = "High Broken Glottal",
            pitchTrend = "35 broken - Glottal break",
            descriptionHinglish = "Upar jati hai, beech me gale me halki si rukawat (glottal stop) aati hai, fir wapas resume hoti hai.",
            indianAnalogy = "Jaise jab bacha bolta hai 'Na-ah!' ya gaana gaate waqt hiccup/break aati hai vocal cord mein.",
            sampleWord = "Mã",
            sampleMeaning = "Ghoda (Horse) ya Code",
            samplePhonetic = "Ma~a (gale me halka break)",
            commonMistake = "South Vietnam me log isko aksar Hỏi jaisa bolte hain; North me glottal stop clear hota hai.",
            examples = listOf(
                ToneExample("Sữa", "Suu~ah", "Doodh (Milk)", "Ngã"),
                ToneExample("Đã", "Daa~", "Ho chuka (Past tense marker)", "Ngã"),
                ToneExample("Mỹ", "Mee~", "America (USA)", "Ngã")
            )
        ),
        ToneGuide(
            id = "nang",
            name = "Thanh Nặng (Heavy Dropping Tone)",
            diacriticSymbol = "ạ (Underdot .)",
            toneType = "Low Abrupt Drop",
            pitchTrend = "21 stop - Abrupt cut-off",
            descriptionHinglish = "Awaaz achanak neeche girke gale me cut off ho jaati hai. Bohot short aur heavy tone.",
            indianAnalogy = "Jaise gusse me short cut me hum bolte hain 'Ruk!' ya 'Hat!'. Sound lamba nahi chalta, foran ruk jata hai.",
            sampleWord = "Mạ",
            sampleMeaning = "Dhan ke paudhe (Rice seedling)",
            samplePhonetic = "Ma. (sudden cut-off)",
            commonMistake = "Isko drag mat kijiye. Sound ko pet aur gale se short drop karke band kar dena hai.",
            examples = listOf(
                ToneExample("Mẹ", "Meh.", "Mummy (North Vietnam)", "Nặng"),
                ToneExample("Tạm biệt", "Taam. bee-et.", "Alvida (Goodbye)", "Nặng"),
                ToneExample("Bạn", "Baan.", "Dost / Friend", "Nặng")
            )
        )
    )

    val pronunciationHacks = listOf(
        Pair("PH = F sound", "Vietnamese me 'PH' ko 'P-H' nahi bolte, bilkul Hindi/English 'F' jaisa bolo! (Phở = Fuh, Cà phê = Kaa fey)."),
        Pair("D vs Đ", "'D' bina cross bar ke North me 'Z' aur South me 'Y' sound karta hai (Dạ = Zaa/Yaa). Jabki 'Đ' with cross bar regular English 'D' hai (Đi = Dee)."),
        Pair("GI = Z sound", "'Gi' ko 'Ji' nahi, balki 'Z' jaisa bolte hain (Gì = Zee, meaning 'Kya')."),
        Pair("KH = Hindi 'ख़' (Guttural Kh)", "Urdu/Hindi ka 'Khabar' wala 'Kh' gale se nikaalo (Không = Khong, meaning 'Nahi')."),
        Pair("NH = Spanish 'ñ' / Hindi 'ञ'", "Shuru me 'Nyah' sound aata hai (Nhà = Nyah, meaning 'Ghar')."),
        Pair("Final Consonants (P, T, C, CH)", "Aakhri consonants me hawa bahar nahi chhodte, jaise Hindi ke aadh-e akshar me sound lock ho jata hai (Một = Mo't, cut-off!).")
    )
}
