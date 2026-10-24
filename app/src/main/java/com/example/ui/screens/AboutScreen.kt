package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.LotusJadeTertiary
import com.example.ui.theme.VietGoldSecondary
import com.example.ui.theme.VietRedPrimary
import com.example.ui.viewmodel.MainViewModel

@Composable
fun AboutScreen(viewModel: MainViewModel) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .testTag("about_screen"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(VietRedPrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Translate,
                            contentDescription = "VietLingo Logo",
                            tint = Color.White,
                            modifier = Modifier.size(36.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "VietLingo",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )

                    Text(
                        text = "Tiếng Việt for Indian Learners (Hinglish Guide)",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Version 1.0 • Built with Kotlin & Jetpack Compose",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }
        }

        // Project Attribution Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Rounded.Code,
                            contentDescription = null,
                            tint = VietGoldSecondary,
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Open Source Inspiration & Attribution",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "VietLingo is inspired by the structured curriculum concepts and beginner topics from the open-source project:",
                        fontSize = 13.sp,
                        lineHeight = 18.sp
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "github.com/katawaredev/learn-vietnamese\n(Licensed under the MIT License)",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = VietRedPrimary,
                            modifier = Modifier.padding(8.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "VietLingo adapts and reimagines these lessons specifically for Indian beginners with Roman script Hinglish explanations, Indian speech analogies for all 6 tones, vegetarian survival tips (ăn chay), and local currency conversions (Triệu vs Lakhs).",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = 17.sp
                    )
                }
            }
        }

        // Features Summary Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Core Features Included",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = LotusJadeTertiary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    val features = listOf(
                        "✅ 10 Structured Beginner Lessons with Hinglish analogies",
                        "✅ Complete 6 Tones (Thanh) Masterclass with pitch contours",
                        "✅ 100+ Curated Vocabulary items with Roman phonetics & diacritics",
                        "✅ Interactive Flashcard Flip Mode & Instant Search",
                        "✅ 30 Interactive Quizzes with explanations & score tracker",
                        "✅ 10 Everyday Dual-Dialogue Conversations with audio",
                        "✅ Android Text-To-Speech with graceful fallback",
                        "✅ VietGuru AI Tutor (Server-side Gemini with offline responses)",
                        "✅ 100% Offline Functional with local persistence"
                    )

                    features.forEach { feat ->
                        Text(
                            text = feat,
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            modifier = Modifier.padding(vertical = 2.dp)
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
