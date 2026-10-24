package com.example.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.UserStats
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class PreferencesRepository(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("vietlingo_user_prefs", Context.MODE_PRIVATE)

    private val _userStats = MutableStateFlow(loadStats())
    val userStats: StateFlow<UserStats> = _userStats.asStateFlow()

    private fun loadStats(): UserStats {
        val completedLessons = prefs.getStringSet("completed_lessons", emptySet())
            ?.mapNotNull { it.toIntOrNull() }?.toSet() ?: emptySet()
        val favorites = prefs.getStringSet("favorite_vocab", emptySet()) ?: emptySet()
        val score = prefs.getInt("quiz_score", 0)
        val attempts = prefs.getInt("quiz_attempts", 0)
        val streak = prefs.getInt("streak_days", 1)
        val goal = prefs.getInt("daily_goal", 15)
        val todayMins = prefs.getInt("today_mins", 8)

        checkAndUpdateDailyStreak()

        return UserStats(
            completedLessonIds = completedLessons,
            favoriteVocabIds = favorites,
            quizScore = score,
            quizzesAttempted = attempts,
            streakDays = streak,
            dailyGoalMinutes = goal,
            todayMinutesStudied = todayMins
        )
    }

    private fun checkAndUpdateDailyStreak() {
        val lastDate = prefs.getString("last_active_date", "")
        val todayStr = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        if (lastDate != todayStr) {
            val currentStreak = prefs.getInt("streak_days", 1)
            // If new day, increment streak if consecutive or keep
            prefs.edit()
                .putString("last_active_date", todayStr)
                .putInt("streak_days", currentStreak.coerceAtLeast(1))
                .apply()
        }
    }

    fun toggleLessonCompleted(lessonId: Int) {
        val current = _userStats.value.completedLessonIds.toMutableSet()
        if (current.contains(lessonId)) {
            current.remove(lessonId)
        } else {
            current.add(lessonId)
        }
        prefs.edit().putStringSet("completed_lessons", current.map { it.toString() }.toSet()).apply()
        _userStats.value = _userStats.value.copy(completedLessonIds = current)
    }

    fun toggleFavoriteVocab(vocabId: String) {
        val current = _userStats.value.favoriteVocabIds.toMutableSet()
        if (current.contains(vocabId)) {
            current.remove(vocabId)
        } else {
            current.add(vocabId)
        }
        prefs.edit().putStringSet("favorite_vocab", current).apply()
        _userStats.value = _userStats.value.copy(favoriteVocabIds = current)
    }

    fun recordQuizResult(correctCount: Int, totalCount: Int) {
        val newScore = _userStats.value.quizScore + correctCount
        val newAttempts = _userStats.value.quizzesAttempted + totalCount
        val newMins = _userStats.value.todayMinutesStudied + 5
        prefs.edit()
            .putInt("quiz_score", newScore)
            .putInt("quiz_attempts", newAttempts)
            .putInt("today_mins", newMins)
            .apply()
        _userStats.value = _userStats.value.copy(
            quizScore = newScore,
            quizzesAttempted = newAttempts,
            todayMinutesStudied = newMins
        )
    }

    fun addStudyMinutes(minutes: Int) {
        val newMins = _userStats.value.todayMinutesStudied + minutes
        prefs.edit().putInt("today_mins", newMins).apply()
        _userStats.value = _userStats.value.copy(todayMinutesStudied = newMins)
    }

    fun getCustomApiKey(): String = prefs.getString("custom_gemini_api_key", "") ?: ""

    fun setCustomApiKey(key: String) {
        prefs.edit().putString("custom_gemini_api_key", key.trim()).apply()
    }
}
