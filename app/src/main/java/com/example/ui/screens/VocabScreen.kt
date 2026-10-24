package com.example.ui.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
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
import com.example.data.model.Vocabulary
import com.example.data.repository.VocabData
import com.example.ui.theme.LotusJadeTertiary
import com.example.ui.theme.VietGoldSecondary
import com.example.ui.theme.VietRedPrimary
import com.example.ui.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VocabScreen(viewModel: MainViewModel) {
    val stats by viewModel.userStats.collectAsState()
    val searchQuery by viewModel.vocabSearchQuery.collectAsState()
    val selectedCategory by viewModel.selectedVocabCategory.collectAsState()
    val showOnlyFavorites by viewModel.showOnlyFavorites.collectAsState()
    val isFlashcardMode by viewModel.isFlashcardMode.collectAsState()
    val flashcardIndex by viewModel.currentFlashcardIndex.collectAsState()
    val isCardFlipped by viewModel.isCardFlipped.collectAsState()

    val filteredList = remember(searchQuery, selectedCategory, showOnlyFavorites, stats.favoriteVocabIds) {
        VocabData.allVocab.filter { item ->
            val matchesCategory = (selectedCategory == "All" || item.category.equals(selectedCategory, ignoreCase = true))
            val matchesFavorite = (!showOnlyFavorites || stats.favoriteVocabIds.contains(item.id))
            val matchesQuery = if (searchQuery.isBlank()) true else {
                item.vietnamese.contains(searchQuery, ignoreCase = true) ||
                        item.romanPhonetic.contains(searchQuery, ignoreCase = true) ||
                        item.hinglishMeaning.contains(searchQuery, ignoreCase = true)
            }
            matchesCategory && matchesFavorite && matchesQuery
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .testTag("vocab_screen")
    ) {
        // Search & Controls Bar
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { viewModel.setVocabSearchQuery(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("vocab_search_input"),
                placeholder = { Text("Search Vietnamese, phonetic ya Hinglish...", fontSize = 13.sp) },
                leadingIcon = {
                    Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search")
                },
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = { viewModel.setVocabSearchQuery("") }) {
                            Icon(imageVector = Icons.Rounded.Clear, contentDescription = "Clear")
                        }
                    }
                },
                singleLine = true,
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = VietRedPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Action row: Category chips + Favorite toggle + Mode switch
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Flashcard / List Mode Button
                FilledTonalButton(
                    onClick = { viewModel.toggleFlashcardMode() },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = if (isFlashcardMode) VietGoldSecondary.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surfaceVariant
                    ),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = if (isFlashcardMode) Icons.Rounded.ViewList else Icons.Rounded.Style,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isFlashcardMode) "List Mode" else "Flashcard Mode",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                // Favorite filter button
                FilterChip(
                    selected = showOnlyFavorites,
                    onClick = { viewModel.toggleShowOnlyFavorites() },
                    label = { Text("★ Bookmarks (${stats.favoriteVocabIds.size})", fontSize = 11.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = VietRedPrimary.copy(alpha = 0.15f),
                        selectedLabelColor = VietRedPrimary
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Category Chips Carousel
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(VocabData.categories) { category ->
                    val isSelected = selectedCategory == category
                    FilterChip(
                        selected = isSelected,
                        onClick = { viewModel.setVocabCategory(category) },
                        label = { Text(category, fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = VietRedPrimary,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }
        }

        Divider()

        // Content: Flashcard Mode vs List Mode
        if (filteredList.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Rounded.SearchOff,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(56.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Koi shabd nahi mila!",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                    Text(
                        text = "Apna search query ya filter reset kijiye.",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                }
            }
        } else if (isFlashcardMode) {
            FlashcardView(
                vocabList = filteredList,
                currentIndex = flashcardIndex.coerceIn(0, filteredList.size - 1),
                isFlipped = isCardFlipped,
                isFavorite = stats.favoriteVocabIds.contains(filteredList[flashcardIndex.coerceIn(0, filteredList.size - 1)].id),
                onFlip = { viewModel.flipCard() },
                onNext = { viewModel.nextFlashcard(filteredList.size) },
                onPrevious = { viewModel.previousFlashcard(filteredList.size) },
                onToggleFavorite = { viewModel.toggleFavoriteVocab(filteredList[flashcardIndex.coerceIn(0, filteredList.size - 1)].id) },
                onSpeak = { text, fallback -> viewModel.speakVietnamese(text, fallback) }
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Text(
                        text = "Showing ${filteredList.size} of ${VocabData.allVocab.size} words",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }

                items(filteredList, key = { it.id }) { vocab ->
                    val isFav = stats.favoriteVocabIds.contains(vocab.id)
                    VocabItemCard(
                        vocab = vocab,
                        isFavorite = isFav,
                        onToggleFavorite = { viewModel.toggleFavoriteVocab(vocab.id) },
                        onSpeak = { viewModel.speakVietnamese(vocab.vietnamese, vocab.romanPhonetic) }
                    )
                }

                item {
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Composable
fun VocabItemCard(
    vocab: Vocabulary,
    isFavorite: Boolean,
    onToggleFavorite: () -> Unit,
    onSpeak: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("vocab_card_${vocab.id}"),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = vocab.vietnamese,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = VietRedPrimary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = vocab.category,
                            fontSize = 10.sp,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onToggleFavorite,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = if (isFavorite) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                            contentDescription = "Favorite",
                            tint = if (isFavorite) VietGoldSecondary else Color.Gray
                        )
                    }

                    IconButton(
                        onClick = onSpeak,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.VolumeUp,
                            contentDescription = "Listen",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }

            Text(
                text = "Phonetic: \"${vocab.romanPhonetic}\"",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = LotusJadeTertiary
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Matlab: ${vocab.hinglishMeaning}",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "💡 Tip: ${vocab.indianPhoneticTip}",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 16.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Surface(
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(
                        text = "Eg: ${vocab.exampleVietnamese}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "→ ${vocab.exampleHinglish}",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
fun FlashcardView(
    vocabList: List<Vocabulary>,
    currentIndex: Int,
    isFlipped: Boolean,
    isFavorite: Boolean,
    onFlip: () -> Unit,
    onNext: () -> Unit,
    onPrevious: () -> Unit,
    onToggleFavorite: () -> Unit,
    onSpeak: (String, String) -> Unit
) {
    val currentVocab = vocabList[currentIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Counter & Favorite
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Card ${currentIndex + 1} of ${vocabList.size}",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )

            IconButton(onClick = onToggleFavorite) {
                Icon(
                    imageVector = if (isFavorite) Icons.Rounded.Star else Icons.Rounded.StarOutline,
                    contentDescription = "Favorite",
                    tint = if (isFavorite) VietGoldSecondary else Color.Gray
                )
            }
        }

        // The Big Interactive Flashcard
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(vertical = 16.dp)
                .clickable(onClick = onFlip)
                .testTag("interactive_flashcard"),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                AnimatedContent(
                    targetState = isFlipped,
                    transitionSpec = { fadeIn(tween(200)) togetherWith fadeOut(tween(200)) },
                    label = "flashcard_flip"
                ) { flipped ->
                    if (!flipped) {
                        // FRONT OF CARD
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Surface(
                                color = VietRedPrimary.copy(alpha = 0.1f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = currentVocab.category.uppercase(),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = VietRedPrimary,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(24.dp))

                            Text(
                                text = currentVocab.vietnamese,
                                fontSize = 36.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = MaterialTheme.colorScheme.onSurface,
                                textAlign = TextAlign.Center
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            IconButton(
                                onClick = { onSpeak(currentVocab.vietnamese, currentVocab.romanPhonetic) },
                                modifier = Modifier
                                    .size(54.dp)
                                    .clip(CircleShape)
                                    .background(VietRedPrimary.copy(alpha = 0.12f))
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.VolumeUp,
                                    contentDescription = "Audio",
                                    tint = VietRedPrimary,
                                    modifier = Modifier.size(28.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(32.dp))

                            Text(
                                text = "👆 Tap card to flip and reveal Hinglish meaning!",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                    } else {
                        // BACK OF CARD
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Phonetic Ucharan:",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = "\"${currentVocab.romanPhonetic}\"",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = LotusJadeTertiary
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(
                                text = currentVocab.hinglishMeaning,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface,
                                textAlign = TextAlign.Center
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            Surface(
                                color = Color(0xFFFFF9E6),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "💡 ${currentVocab.indianPhoneticTip}",
                                    fontSize = 12.sp,
                                    color = Color(0xFF8C3200),
                                    modifier = Modifier.padding(10.dp),
                                    textAlign = TextAlign.Center
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Text(
                                text = "Example: ${currentVocab.exampleVietnamese}\n(${currentVocab.exampleHinglish})",
                                fontSize = 12.sp,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }

        // Navigation Controls
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedButton(
                onClick = onPrevious,
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Previous")
                Spacer(modifier = Modifier.width(6.dp))
                Text("Previous")
            }

            Button(
                onClick = onNext,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = VietRedPrimary)
            ) {
                Text("Next")
                Spacer(modifier = Modifier.width(6.dp))
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = "Next")
            }
        }
    }
}
