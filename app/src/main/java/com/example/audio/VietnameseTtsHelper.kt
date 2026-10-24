package com.example.audio

import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import java.util.Locale

class VietnameseTtsHelper(private val context: Context) : TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    var isInitialized: Boolean = false
        private set
    var isVietnameseSupported: Boolean = false
        private set

    init {
        tts = TextToSpeech(context.applicationContext, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val viLocale = Locale("vi", "VN")
            val result = tts?.setLanguage(viLocale)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                val fallbackVi = Locale("vi")
                val fallbackResult = tts?.setLanguage(fallbackVi)
                if (fallbackResult == TextToSpeech.LANG_MISSING_DATA || fallbackResult == TextToSpeech.LANG_NOT_SUPPORTED) {
                    isVietnameseSupported = false
                    Log.w("VietnameseTtsHelper", "Vietnamese voice data not installed on device")
                } else {
                    isVietnameseSupported = true
                    tts?.setPitch(1.0f)
                    tts?.setSpeechRate(0.85f) // slightly slower for language learners
                }
            } else {
                isVietnameseSupported = true
                tts?.setPitch(1.0f)
                tts?.setSpeechRate(0.85f)
            }
            isInitialized = true
        } else {
            isInitialized = false
            Log.e("VietnameseTtsHelper", "TextToSpeech init failed")
        }
    }

    fun speak(text: String, phoneticFallback: String? = null) {
        if (!isInitialized || tts == null) {
            showToast("Speech engine initializing... Bolo: ${phoneticFallback ?: text}")
            return
        }

        if (isVietnameseSupported) {
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "VIETLINGO_AUDIO_${System.currentTimeMillis()}")
        } else {
            // Graceful handling when Vietnamese voice data is missing from emulator or device
            showToast("Vietnamese voice pack missing. Hinglish ucharan: \"${phoneticFallback ?: text}\"")
        }
    }

    private fun showToast(msg: String) {
        try {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        } catch (_: Exception) {}
    }

    fun shutdown() {
        try {
            tts?.stop()
            tts?.shutdown()
        } catch (_: Exception) {}
    }
}
