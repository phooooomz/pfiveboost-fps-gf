// app/src/main/java/com/pfiveboost/p5/ui/theme/Theme.kt
package com.pfiveboost.p5.ui.theme

import android.app.Activity
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat

private val PfiveboostColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = DarkBackground,
    primaryContainer = Color(0xFF0B3440),
    onPrimaryContainer = Color(0xFFB8F3FF),
    secondary = ElectricOrange,
    onSecondary = DarkBackground,
    secondaryContainer = Color(0xFF3A2410),
    onSecondaryContainer = Color(0xFFFFD2A6),
    tertiary = NeonGreen,
    onTertiary = DarkBackground,
    tertiaryContainer = Color(0xFF0E3322),
    onTertiaryContainer = Color(0xFFB6F5D2),
    background = DarkBackground,
    onBackground = TextPrimary,
    surface = DarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = TextSecondary,
    surfaceContainerLowest = DarkBackground,
    surfaceContainer = DarkSurface,
    surfaceContainerHigh = DarkSurfaceVariant,
    surfaceContainerHighest = DarkSurfaceHighlight,
    outline = DarkOutline,
    outlineVariant = DarkOutline,
    error = DangerRed,
    onError = DarkBackground
)

private val PfiveboostShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(20.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

@Composable
fun PfiveboostTheme(content: @Composable () -> Unit) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                window.statusBarColor = DarkBackground.toArgb()
                window.navigationBarColor = DarkBackground.toArgb()
                val insetsController = WindowCompat.getInsetsController(window, view)
                insetsController.isAppearanceLightStatusBars = false
                insetsController.isAppearanceLightNavigationBars = false
            }
        }
    }

    MaterialTheme(
        colorScheme = PfiveboostColorScheme,
        typography = Typography,
        shapes = PfiveboostShapes,
        content = content
    )
}
