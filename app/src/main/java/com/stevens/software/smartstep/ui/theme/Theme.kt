package com.stevens.software.smartstep.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme.colorScheme

data class ExtendedColours(
    val buttonPrimary: Color,
    val buttonSecondary: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textWhite: Color,
    val backgroundMain: Color,
    val backgroundSecondary: Color,
    val backgroundTertiary: Color,
    val backgroundWhite: Color,
    val strokeMain: Color
)

val extendedColors = ExtendedColours(
    buttonPrimary = SlateBlue,
    buttonSecondary = Lavender,
    textPrimary = Black,
    textSecondary = DimGray,
    textWhite = White,
    backgroundMain = AliceBlue,
    backgroundSecondary = WhiteSmoke,
    backgroundTertiary = WarmGray,
    backgroundWhite = White,
    strokeMain = Gainsboro
)

val localExtendedColors = compositionLocalOf { extendedColors }

@Composable
fun SmartStepTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(localExtendedColors provides extendedColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

val MaterialTheme.extendedColours: ExtendedColours
    @Composable
    @ReadOnlyComposable
    get() = localExtendedColors.current