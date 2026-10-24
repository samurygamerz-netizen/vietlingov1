package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.ToneGuide
import com.example.data.repository.ToneData
import com.example.ui.theme.LotusJadeTertiary
import com.example.ui.theme.VietGoldSecondary
import com.example.ui.theme.VietRedPrimary
import com.example.ui.viewmodel.MainViewModel

@Composable
fun TonesGuideScreen(viewModel: MainViewModel) {
    val tones = ToneData.allTones
    val pronunciationHacks = ToneData.pronunciationHacks

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .testTag("tones_guide_screen"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Masterclass Header
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(VietRedPrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.GraphicEq,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Vietnamese 6 Tones (Sur) Masterclass",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                            Text(
                                text = "Sur badalne se shabd ka matlab badal jata hai!",
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Example dekhein: 'Ma' (Bhoot), 'Mà' (Lekin), 'Má' (Mummy/Gaal), 'Mả' (Qabar), 'Mã' (Ghoda), 'Mạ' (Paudha). " +
                                "Sabhi ek hi 'Ma' hain, bas sur (tone) alag hai!",
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        lineHeight = 18.sp
                    )
                }
            }
        }

        // Tones Cards
        items(tones) { tone ->
            ToneDetailCard(tone = tone) { word, phonetic ->
                viewModel.speakVietnamese(word, phonetic)
            }
        }

        // Vowel and Pronunciation Hacks Section
        item {
            Text(
                text = "Pronunciation Hacks for Indian Speakers 💡",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }

        items(pronunciationHacks) { hack ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(LotusJadeTertiary.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.TipsAndUpdates,
                            contentDescription = null,
                            tint = LotusJadeTertiary,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = hack.first,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = VietRedPrimary
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = hack.second,
                            fontSize = 13.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        // Special Vietnamese Vowels Cheat Sheet
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Vowels Cheat-Sheet (Swar Guide)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "• Ă / ă : Chhota 'Aa' sound (Jaise Hindi 'अ')\n" +
                                "• Â / â : Short neutral 'Uh' sound (Jaise English 'Cup' ka U)\n" +
                                "• Ê / ê : 'Ey' sound (Jaise Hindi 'ए' in Seb)\n" +
                                "• Ô / ô : Gol 'Oh' sound (Jaise Hindi 'ओ' in Mor)\n" +
                                "• Ơ / ơ : Open relaxed 'Uh' sound (Moo khula rakhkar 'Uh' bolo)\n" +
                                "• Ư / ư : Smile karke 'Oo' bolo (Teeth band karke 'Oo' bolo)",
                        fontSize = 13.sp,
                        lineHeight = 22.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun ToneDetailCard(
    tone: ToneGuide,
    onSpeak: (String, String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("tone_card_${tone.id}"),
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
                Column {
                    Text(
                        text = tone.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = VietRedPrimary
                    )
                    Text(
                        text = "${tone.toneType}  •  Pitch: ${tone.pitchTrend}",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }

                Surface(
                    color = VietRedPrimary.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = tone.diacriticSymbol,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = VietRedPrimary,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Indian Analogy Callout Box
            Surface(
                color = Color(0xFFFFF9E6),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        text = "🇮🇳 Indian Speech Analogy:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF8C3200)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = tone.indianAnalogy,
                        fontSize = 13.sp,
                        color = Color(0xFF5D2400),
                        lineHeight = 18.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Hinglish Guide: ${tone.descriptionHinglish}",
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 18.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Common Mistake: ${tone.commonMistake}",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.error,
                lineHeight = 16.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Sample Word with Audio
            Surface(
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Sample Word: ",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = tone.sampleWord,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = VietRedPrimary
                            )
                        }
                        Text(
                            text = "Matlab: ${tone.sampleMeaning} (${tone.samplePhonetic})",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    IconButton(
                        onClick = { onSpeak(tone.sampleWord, tone.samplePhonetic) },
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.VolumeUp,
                            contentDescription = "Hear Sample",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }

            // More examples
            if (tone.examples.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    tone.examples.forEach { eg ->
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { onSpeak(eg.word, eg.phonetic) },
                            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(6.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = eg.word,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                                Text(
                                    text = eg.meaning,
                                    fontSize = 10.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    maxLines = 1
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
