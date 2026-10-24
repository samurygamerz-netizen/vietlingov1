package com.example.data.model

data class ToneExample(
    val word: String,
    val phonetic: String,
    val meaning: String,
    val toneMark: String
)

data class ToneGuide(
    val id: String,
    val name: String,
    val diacriticSymbol: String,
    val toneType: String,
    val pitchTrend: String, // e.g. "44 (Flat)", "31 (Falling)", "35 (Rising)", "313 (Dipping)", "35 glottal", "21 glottal stop"
    val descriptionHinglish: String,
    val indianAnalogy: String,
    val sampleWord: String,
    val sampleMeaning: String,
    val samplePhonetic: String,
    val commonMistake: String,
    val examples: List<ToneExample>
)

data class LessonSection(
    val heading: String,
    val contentHinglish: String,
    val bulletPoints: List<String> = emptyList(),
    val examplePhrase: String? = null,
    val exampleMeaning: String? = null
)

data class DialogueLine(
    val speaker: String,
    val speakerRole: String,
    val vietnamese: String,
    val romanPhonetic: String,
    val hinglish: String
)

data class Lesson(
    val id: Int,
    val title: String,
    val titleHinglish: String,
    val subtitle: String,
    val category: String,
    val estimatedMinutes: Int,
    val introHinglish: String,
    val indianAnalogy: String,
    val sections: List<LessonSection>,
    val keyVocabulary: List<Vocabulary>,
    val practiceDialogue: List<DialogueLine>
)

data class Vocabulary(
    val id: String,
    val vietnamese: String,
    val romanPhonetic: String,
    val hinglishMeaning: String,
    val indianPhoneticTip: String,
    val category: String,
    val exampleVietnamese: String,
    val exampleHinglish: String,
    val isFavorite: Boolean = false
)

data class QuizQuestion(
    val id: Int,
    val lessonId: Int? = null,
    val question: String,
    val questionHinglish: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val explanationHinglish: String,
    val vietnamesePrompt: String? = null
)

data class Conversation(
    val id: String,
    val title: String,
    val titleHinglish: String,
    val contextHinglish: String,
    val dialogues: List<DialogueLine>
)

data class UserStats(
    val completedLessonIds: Set<Int> = emptySet(),
    val favoriteVocabIds: Set<String> = emptySet(),
    val quizScore: Int = 0,
    val quizzesAttempted: Int = 0,
    val streakDays: Int = 1,
    val dailyGoalMinutes: Int = 15,
    val todayMinutesStudied: Int = 8
)
