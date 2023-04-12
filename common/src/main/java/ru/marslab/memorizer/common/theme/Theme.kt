package ru.marslab.memorizer.common.theme // ktlint-disable filename

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MemTheme(
    content: @Composable () -> Unit
) {
    LocalContentProvider() {
        MaterialTheme(
            colors = materialThemeColors,
            typography = materialThemeTypography,
            shapes = materialThemeShapes,
            content = content
        )
    }
}
