package com.example.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.screens.*
import com.example.ui.theme.LotusJadeTertiary
import com.example.ui.theme.VietRedPrimary
import com.example.ui.viewmodel.MainViewModel
import com.example.ui.viewmodel.ScreenTab

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainViewModel) {
    val currentTab by viewModel.currentTab.collectAsState()
    val selectedLesson by viewModel.selectedLesson.collectAsState()

    // Handle system back button: return to Home tab or close lesson detail
    BackHandler(enabled = currentTab != ScreenTab.HOME || selectedLesson != null) {
        if (selectedLesson != null) {
            viewModel.closeLessonDetail()
        } else {
            viewModel.navigateToTab(ScreenTab.HOME)
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            if (currentTab != ScreenTab.LESSONS || selectedLesson == null) {
                TopAppBar(
                    title = {
                        Column {
                            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                                Text(
                                    text = "VietLingo",
                                    fontSize = 19.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = VietRedPrimary
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "🇮🇳 ⇄ 🇻🇳",
                                    fontSize = 14.sp
                                )
                            }
                            Text(
                                text = "Vietnamese for Indian Learners",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    },
                    actions = {
                        IconButton(
                            onClick = { viewModel.navigateToTab(ScreenTab.TONES) },
                            modifier = Modifier.testTag("top_bar_tones_button")
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.GraphicEq,
                                contentDescription = "Tones Masterclass",
                                tint = if (currentTab == ScreenTab.TONES) VietRedPrimary else MaterialTheme.colorScheme.onSurface
                            )
                        }

                        IconButton(
                            onClick = { viewModel.navigateToTab(ScreenTab.CONVERSATIONS) },
                            modifier = Modifier.testTag("top_bar_conversations_button")
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Forum,
                                contentDescription = "Conversations",
                                tint = if (currentTab == ScreenTab.CONVERSATIONS) VietRedPrimary else MaterialTheme.colorScheme.onSurface
                            )
                        }

                        IconButton(
                            onClick = { viewModel.navigateToTab(ScreenTab.ABOUT) },
                            modifier = Modifier.testTag("top_bar_about_button")
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Info,
                                contentDescription = "About App",
                                tint = if (currentTab == ScreenTab.ABOUT) VietRedPrimary else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    )
                )
            }
        },
        bottomBar = {
            NavigationBar(
                modifier = Modifier.testTag("bottom_nav_bar"),
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                NavigationBarItem(
                    selected = currentTab == ScreenTab.HOME,
                    onClick = { viewModel.navigateToTab(ScreenTab.HOME) },
                    icon = {
                        Icon(
                            imageVector = if (currentTab == ScreenTab.HOME) Icons.Rounded.Home else Icons.Rounded.Home,
                            contentDescription = "Home"
                        )
                    },
                    label = { Text("Home", fontSize = 11.sp) },
                    modifier = Modifier.testTag("bottom_nav_home"),
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = VietRedPrimary,
                        selectedTextColor = VietRedPrimary,
                        indicatorColor = VietRedPrimary.copy(alpha = 0.15f)
                    )
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.LESSONS,
                    onClick = { viewModel.navigateToTab(ScreenTab.LESSONS) },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.MenuBook,
                            contentDescription = "Lessons"
                        )
                    },
                    label = { Text("Lessons", fontSize = 11.sp) },
                    modifier = Modifier.testTag("bottom_nav_lessons"),
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = VietRedPrimary,
                        selectedTextColor = VietRedPrimary,
                        indicatorColor = VietRedPrimary.copy(alpha = 0.15f)
                    )
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.VOCAB,
                    onClick = { viewModel.navigateToTab(ScreenTab.VOCAB) },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Style,
                            contentDescription = "Vocab"
                        )
                    },
                    label = { Text("Vocab", fontSize = 11.sp) },
                    modifier = Modifier.testTag("bottom_nav_vocab"),
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = VietRedPrimary,
                        selectedTextColor = VietRedPrimary,
                        indicatorColor = VietRedPrimary.copy(alpha = 0.15f)
                    )
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.QUIZ,
                    onClick = { viewModel.navigateToTab(ScreenTab.QUIZ) },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Quiz,
                            contentDescription = "Quiz"
                        )
                    },
                    label = { Text("Quiz", fontSize = 11.sp) },
                    modifier = Modifier.testTag("bottom_nav_quiz"),
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = VietRedPrimary,
                        selectedTextColor = VietRedPrimary,
                        indicatorColor = VietRedPrimary.copy(alpha = 0.15f)
                    )
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.AI_TUTOR,
                    onClick = { viewModel.navigateToTab(ScreenTab.AI_TUTOR) },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.SmartToy,
                            contentDescription = "AI Tutor"
                        )
                    },
                    label = { Text("AI Tutor", fontSize = 11.sp) },
                    modifier = Modifier.testTag("bottom_nav_ai_tutor"),
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = LotusJadeTertiary,
                        selectedTextColor = LotusJadeTertiary,
                        indicatorColor = LotusJadeTertiary.copy(alpha = 0.15f)
                    )
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (currentTab) {
                ScreenTab.HOME -> HomeScreen(viewModel = viewModel)
                ScreenTab.LESSONS -> LessonsScreen(viewModel = viewModel)
                ScreenTab.TONES -> TonesGuideScreen(viewModel = viewModel)
                ScreenTab.VOCAB -> VocabScreen(viewModel = viewModel)
                ScreenTab.QUIZ -> QuizScreen(viewModel = viewModel)
                ScreenTab.CONVERSATIONS -> ConversationsScreen(viewModel = viewModel)
                ScreenTab.AI_TUTOR -> AiTutorScreen(viewModel = viewModel)
                ScreenTab.ABOUT -> AboutScreen(viewModel = viewModel)
            }
        }
    }
}
