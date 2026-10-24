package com.example

import com.example.data.repository.ConversationData
import com.example.data.repository.LessonData
import com.example.data.repository.QuizData
import com.example.data.repository.ToneData
import com.example.data.repository.VocabData
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun testLessonDataIntegrity() {
        val lessons = LessonData.lessons
        assertEquals("Must have 10 structured beginner lessons", 10, lessons.size)
        lessons.forEach { lesson ->
            assertTrue("Lesson title must not be empty", lesson.title.isNotBlank())
            assertTrue("Lesson titleHinglish must not be empty", lesson.titleHinglish.isNotBlank())
            assertTrue("Lesson must have sections", lesson.sections.isNotEmpty())
            assertTrue("Lesson must have Indian analogy", lesson.indianAnalogy.isNotBlank())
        }
    }

    @Test
    fun testVocabDataIntegrity() {
        val vocab = VocabData.allVocab
        assertTrue("Must have at least 100 vocabulary items", vocab.size >= 100)
        vocab.forEach { item ->
            assertTrue("Vietnamese text must not be empty", item.vietnamese.isNotBlank())
            assertTrue("Phonetic must not be empty", item.romanPhonetic.isNotBlank())
            assertTrue("Hinglish meaning must not be empty", item.hinglishMeaning.isNotBlank())
            assertTrue("Indian phonetic tip must not be empty", item.indianPhoneticTip.isNotBlank())
        }
    }

    @Test
    fun testTonesDataIntegrity() {
        val tones = ToneData.allTones
        assertEquals("Must have all 6 tones", 6, tones.size)
        tones.forEach { tone ->
            assertTrue("Diacritic mark must not be empty", tone.diacriticSymbol.isNotBlank())
            assertTrue("Indian analogy must not be empty", tone.indianAnalogy.isNotBlank())
            assertTrue("Sample word must not be empty", tone.sampleWord.isNotBlank())
        }
    }

    @Test
    fun testQuizDataIntegrity() {
        val questions = QuizData.questions
        assertTrue("Must have at least 30 quiz questions", questions.size >= 30)
        questions.forEach { q ->
            assertTrue("Question text must not be empty", q.question.isNotBlank())
            assertEquals("Must have 4 options", 4, q.options.size)
            assertTrue("Correct answer index must be 0..3", q.correctAnswerIndex in 0..3)
            assertTrue("Explanation must not be empty", q.explanationHinglish.isNotBlank())
        }
    }

    @Test
    fun testConversationDataIntegrity() {
        val conversations = ConversationData.conversations
        assertEquals("Must have 10 everyday conversations", 10, conversations.size)
        conversations.forEach { conv ->
            assertTrue("Title must not be empty", conv.title.isNotBlank())
            assertTrue("Dialogues must not be empty", conv.dialogues.isNotEmpty())
        }
    }
}
