package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ai.GeminiTutorService
import com.example.audio.VietnameseTtsHelper
import com.example.data.model.Conversation
import com.example.data.model.Lesson
import com.example.data.model.QuizQuestion
import com.example.data.model.ToneGuide
import com.example.data.model.UserStats
import com.example.data.model.Vocabulary
import com.example.data.repository.ConversationData
import com.example.data.repository.LessonData
import com.example.data.repository.PreferencesRepository
import com.example.data.repository.QuizData
import com.example.data.repository.ToneData
import com.example.data.repository.VocabData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

enum class ScreenTab {
    HOME,
    LESSONS,
    TONES,
    VOCAB,
    QUIZ,
    CONVERSATIONS,
    AI_TUTOR,
    ABOUT
}

data class ChatMessage(
    val sender: String,
    val text: String,
    val isUser: Boolean,
    val timestamp: Long = System.currentTimeMillis()
)

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val prefsRepo = PreferencesRepository(application)
    val ttsHelper = VietnameseTtsHelper(application)

    val userStats: StateFlow<UserStats> = prefsRepo.userStats

    private val _currentTab = MutableStateFlow(ScreenTab.HOME)
    val currentTab: StateFlow<ScreenTab> = _currentTab.asStateFlow()

    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    val selectedLesson: StateFlow<Lesson?> = _selectedLesson.asStateFlow()

    // Vocab Search & Filtering
    private val _vocabSearchQuery = MutableStateFlow("")
    val vocabSearchQuery: StateFlow<String> = _vocabSearchQuery.asStateFlow()

    private val _selectedVocabCategory = MutableStateFlow("All")
    val selectedVocabCategory: StateFlow<String> = _selectedVocabCategory.asStateFlow()

    private val _showOnlyFavorites = MutableStateFlow(false)
    val showOnlyFavorites: StateFlow<Boolean> = _showOnlyFavorites.asStateFlow()

    private val _isFlashcardMode = MutableStateFlow(false)
    val isFlashcardMode: StateFlow<Boolean> = _isFlashcardMode.asStateFlow()

    private val _currentFlashcardIndex = MutableStateFlow(0)
    val currentFlashcardIndex: StateFlow<Int> = _currentFlashcardIndex.asStateFlow()

    private val _isCardFlipped = MutableStateFlow(false)
    val isCardFlipped: StateFlow<Boolean> = _isCardFlipped.asStateFlow()

    // Quiz State
    private val _currentQuizIndex = MutableStateFlow(0)
    val currentQuizIndex: StateFlow<Int> = _currentQuizIndex.asStateFlow()

    private val _selectedOption = MutableStateFlow<Int?>(null)
    val selectedOption: StateFlow<Int?> = _selectedOption.asStateFlow()

    private val _isAnswerSubmitted = MutableStateFlow(false)
    val isAnswerSubmitted: StateFlow<Boolean> = _isAnswerSubmitted.asStateFlow()

    private val _quizScoreSession = MutableStateFlow(0)
    val quizScoreSession: StateFlow<Int> = _quizScoreSession.asStateFlow()

    private val _isQuizCompleted = MutableStateFlow(false)
    val isQuizCompleted: StateFlow<Boolean> = _isQuizCompleted.asStateFlow()

    // AI Chat State
    private val _chatMessages = MutableStateFlow(
        listOf(
            ChatMessage(
                sender = "VietGuru",
                text = "Namaste dost! Main VietGuru hoon. Main aapko Vietnamese language, tones, aur food culture bilkul desi style Hinglish me sikhaunga.\n\nKuch bhi pooch sakte hain jaise: 'Veg khana kaise order karein?', '6 tones ke shortcuts', ya 'Vietnamese pronouns kaise kaam karte hain?'",
                isUser = false
            )
        )
    )
    val chatMessages: StateFlow<List<ChatMessage>> = _chatMessages.asStateFlow()

    private val _isAiLoading = MutableStateFlow(false)
    val isAiLoading: StateFlow<Boolean> = _isAiLoading.asStateFlow()

    fun navigateToTab(tab: ScreenTab) {
        _currentTab.value = tab
        if (tab != ScreenTab.LESSONS) {
            _selectedLesson.value = null
        }
    }

    fun openLesson(lesson: Lesson) {
        _selectedLesson.value = lesson
        _currentTab.value = ScreenTab.LESSONS
    }

    fun closeLessonDetail() {
        _selectedLesson.value = null
    }

    fun toggleLessonCompleted(lessonId: Int) {
        prefsRepo.toggleLessonCompleted(lessonId)
    }

    fun toggleFavoriteVocab(vocabId: String) {
        prefsRepo.toggleFavoriteVocab(vocabId)
    }

    fun setVocabSearchQuery(query: String) {
        _vocabSearchQuery.value = query
    }

    fun setVocabCategory(category: String) {
        _selectedVocabCategory.value = category
    }

    fun toggleShowOnlyFavorites() {
        _showOnlyFavorites.value = !_showOnlyFavorites.value
    }

    fun toggleFlashcardMode() {
        _isFlashcardMode.value = !_isFlashcardMode.value
        _isCardFlipped.value = false
    }

    fun flipCard() {
        _isCardFlipped.value = !_isCardFlipped.value
    }

    fun nextFlashcard(totalCount: Int) {
        if (totalCount > 0) {
            _currentFlashcardIndex.value = (_currentFlashcardIndex.value + 1) % totalCount
            _isCardFlipped.value = false
        }
    }

    fun previousFlashcard(totalCount: Int) {
        if (totalCount > 0) {
            _currentFlashcardIndex.value = if (_currentFlashcardIndex.value > 0) _currentFlashcardIndex.value - 1 else totalCount - 1
            _isCardFlipped.value = false
        }
    }

    fun selectQuizOption(index: Int) {
        if (!_isAnswerSubmitted.value) {
            _selectedOption.value = index
        }
    }

    fun submitQuizAnswer(correctAnswerIndex: Int) {
        if (_selectedOption.value != null && !_isAnswerSubmitted.value) {
            _isAnswerSubmitted.value = true
            if (_selectedOption.value == correctAnswerIndex) {
                _quizScoreSession.value += 1
            }
        }
    }

    fun nextQuizQuestion(totalQuestions: Int) {
        if (_currentQuizIndex.value + 1 < totalQuestions) {
            _currentQuizIndex.value += 1
            _selectedOption.value = null
            _isAnswerSubmitted.value = false
        } else {
            _isQuizCompleted.value = true
            prefsRepo.recordQuizResult(_quizScoreSession.value, totalQuestions)
        }
    }

    fun restartQuiz() {
        _currentQuizIndex.value = 0
        _selectedOption.value = null
        _isAnswerSubmitted.value = false
        _quizScoreSession.value = 0
        _isQuizCompleted.value = false
    }

    fun speakVietnamese(text: String, phoneticFallback: String? = null) {
        ttsHelper.speak(text, phoneticFallback)
    }

    fun getEffectiveApiKey(): String {
        val custom = prefsRepo.getCustomApiKey()
        if (custom.isNotBlank()) return custom
        return com.example.BuildConfig.GEMINI_API_KEY
    }

    fun setCustomApiKey(key: String) {
        prefsRepo.setCustomApiKey(key)
    }

    fun isAiKeyReady(): Boolean {
        return GeminiTutorService.isKeyValid(getEffectiveApiKey())
    }

    fun sendChatMessage(query: String) {
        if (query.isBlank()) return
        val userMsg = ChatMessage(sender = "You", text = query, isUser = true)
        _chatMessages.value = _chatMessages.value + userMsg
        _isAiLoading.value = true

        viewModelScope.launch {
            val response = GeminiTutorService.askTutor(query, getEffectiveApiKey())
            _chatMessages.value = _chatMessages.value + ChatMessage(
                sender = "VietGuru",
                text = response,
                isUser = false
            )
            _isAiLoading.value = false
        }
    }

    override fun onCleared() {
        super.onCleared()
        ttsHelper.shutdown()
    }
}
