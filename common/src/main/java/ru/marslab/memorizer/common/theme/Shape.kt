package ru.marslab.memorizer.common.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

val materialThemeShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(0.dp)
)

data class MemShapes(
    val round: Shape
)

internal val memShapes = MemShapes(
    round = RoundedCornerShape(50)
)
