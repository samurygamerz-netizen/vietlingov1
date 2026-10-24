package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = VietRedPrimaryDark,
    onPrimary = Color(0xFF410002),
    primaryContainer = VietRedDark,
    onPrimaryContainer = Color(0xFFFFDAD6),
    secondary = VietGoldDarkTheme,
    onSecondary = Color(0xFF3F2E00),
    secondaryContainer = VietGoldDark,
    onSecondaryContainer = Color(0xFFFFE08B),
    tertiary = LotusJadeDark,
    onTertiary = Color(0xFF00382B),
    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkCard,
    onBackground = Color(0xFFEDE0DE),
    onSurface = Color(0xFFEDE0DE),
    onSurfaceVariant = Color(0xFFD7C1BF)
)

private val LightColorScheme = lightColorScheme(
    primary = VietRedPrimary,
    onPrimary = Color.White,
    primaryContainer = VietRedLight,
    onPrimaryContainer = Color(0xFF410002),
    secondary = VietGoldSecondary,
    onSecondary = Color(0xFF241A00),
    secondaryContainer = VietGoldLight,
    onSecondaryContainer = Color(0xFF5A4100),
    tertiary = LotusJadeTertiary,
    onTertiary = Color.White,
    background = PaperCreamLight,
    surface = PaperCardLight,
    surfaceVariant = Color(0xFFF3EDE4),
    onBackground = TextDark,
    onSurface = TextDark,
    onSurfaceVariant = TextMuted
)

@Composable
fun VietLingoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Keep authentic VietLingo styling by default
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
