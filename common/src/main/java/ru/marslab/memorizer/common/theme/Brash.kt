package ru.marslab.memorizer.common.theme

import androidx.compose.ui.graphics.Brush

data class MemBrash(
    val sampleBrush: Brush
)

internal val memBrash = MemBrash(
    sampleBrush = Brush.horizontalGradient(listOf())
)
