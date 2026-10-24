package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.repository.QuizData
import com.example.ui.theme.LotusJadeTertiary
import com.example.ui.theme.VietGoldSecondary
import com.example.ui.theme.VietRedPrimary
import com.example.ui.viewmodel.MainViewModel

@Composable
fun QuizScreen(viewModel: MainViewModel) {
    val currentQuizIndex by viewModel.currentQuizIndex.collectAsState()
    val selectedOption by viewModel.selectedOption.collectAsState()
    val isSubmitted by viewModel.isAnswerSubmitted.collectAsState()
    val sessionScore by viewModel.quizScoreSession.collectAsState()
    val isCompleted by viewModel.isQuizCompleted.collectAsState()

    val questions = QuizData.questions
    val totalCount = questions.size

    if (isCompleted) {
        QuizCompletionScreen(
            score = sessionScore,
            total = totalCount,
            onRestart = { viewModel.restartQuiz() }
        )
    } else {
        val currentQ = questions[currentQuizIndex.coerceIn(0, totalCount - 1)]

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .testTag("quiz_screen"),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Header with Progress & Score
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Question ${currentQuizIndex + 1} of $totalCount",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )

                            Surface(
                                color = VietGoldSecondary.copy(alpha = 0.2f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.EmojiEvents,
                                        contentDescription = "Score",
                                        tint = VietGoldSecondary,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "$sessionScore Points",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = VietGoldSecondary
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        val progressFraction = (currentQuizIndex + 1).toFloat() / totalCount.toFloat()
                        LinearProgressIndicator(
                            progress = { progressFraction },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = VietRedPrimary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    }
                }
            }

            // Question Box
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        Text(
                            text = currentQ.question,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            lineHeight = 24.sp
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = currentQ.questionHinglish,
                            fontSize = 13.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
                        )
                    }
                }
            }

            // 4 Option Cards
            items(currentQ.options.size) { index ->
                val optionText = currentQ.options[index]
                val isSelected = selectedOption == index
                val isCorrect = currentQ.correctAnswerIndex == index

                val backgroundColor = when {
                    !isSubmitted && isSelected -> MaterialTheme.colorScheme.primaryContainer
                    isSubmitted && isCorrect -> LotusJadeTertiary.copy(alpha = 0.2f)
                    isSubmitted && isSelected && !isCorrect -> MaterialTheme.colorScheme.errorContainer
                    else -> MaterialTheme.colorScheme.surface
                }

                val borderColor = when {
                    !isSubmitted && isSelected -> VietRedPrimary
                    isSubmitted && isCorrect -> LotusJadeTertiary
                    isSubmitted && isSelected && !isCorrect -> MaterialTheme.colorScheme.error
                    else -> MaterialTheme.colorScheme.outlineVariant
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(enabled = !isSubmitted) { viewModel.selectQuizOption(index) }
                        .testTag("quiz_option_$index"),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = backgroundColor),
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, borderColor)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(borderColor.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${('A' + index)}",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = borderColor
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(
                            text = optionText,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.weight(1f)
                        )

                        if (isSubmitted) {
                            if (isCorrect) {
                                Icon(
                                    imageVector = Icons.Rounded.CheckCircle,
                                    contentDescription = "Correct",
                                    tint = LotusJadeTertiary,
                                    modifier = Modifier.size(24.dp)
                                )
                            } else if (isSelected) {
                                Icon(
                                    imageVector = Icons.Rounded.Cancel,
                                    contentDescription = "Wrong",
                                    tint = MaterialTheme.colorScheme.error,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                }
            }

            // Explanation Section (Reveals after submit)
            item {
                AnimatedVisibility(visible = isSubmitted) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFF9E6)
                        )
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Rounded.Lightbulb,
                                    contentDescription = null,
                                    tint = Color(0xFFE65100),
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Hinglish Explanation:",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = Color(0xFF8C3200)
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = currentQ.explanationHinglish,
                                fontSize = 13.sp,
                                color = Color(0xFF5D2400),
                                lineHeight = 19.sp
                            )
                        }
                    }
                }
            }

            // Action Button (Submit or Next)
            item {
                Spacer(modifier = Modifier.height(10.dp))
                if (!isSubmitted) {
                    Button(
                        onClick = { viewModel.submitQuizAnswer(currentQ.correctAnswerIndex) },
                        enabled = selectedOption != null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .testTag("quiz_submit_button"),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = VietRedPrimary)
                    ) {
                        Text(
                            text = "Submit Answer",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }
                } else {
                    Button(
                        onClick = { viewModel.nextQuizQuestion(totalCount) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .testTag("quiz_next_button"),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = VietRedPrimary)
                    ) {
                        Text(
                            text = if (currentQuizIndex + 1 < totalCount) "Next Question →" else "View Results 🎉",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
fun QuizCompletionScreen(
    score: Int,
    total: Int,
    onRestart: () -> Unit
) {
    val percentage = (score.toFloat() / total.toFloat() * 100).toInt()
    val badgeTitle = when {
        percentage >= 80 -> "Vietnamese Guru 🏆"
        percentage >= 50 -> "Pro Learner ⭐"
        else -> "Great Effort! Keep Practicing 🚀"
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(VietGoldSecondary.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.EmojiEvents,
                        contentDescription = "Trophy",
                        tint = VietGoldSecondary,
                        modifier = Modifier.size(48.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Quiz Completed!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Text(
                    text = badgeTitle,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = VietRedPrimary
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Aapka Score: $score / $total ($percentage%)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Points aapke profile me add ho gaye hain. Roz practice karke Vietnamese fluently bolna seekhein!",
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Gray,
                    lineHeight = 18.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = onRestart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .testTag("quiz_restart_button"),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = VietRedPrimary)
                ) {
                    Icon(imageVector = Icons.Rounded.Refresh, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Retry / Practice Again", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
