package ru.marslab.memorizer.common.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

internal val background = Color(0xFFFFFFFF)

internal val materialThemeColors = lightColors()

data class MemColors(
    val background: Color
)

internal val memColors = MemColors(
    background = background
)
