package ru.marslab.memorizer.common.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class MemDimens(
    // Base Dims
    val verySmallDim: Dp,
    val smallDim: Dp,
    val halfMediumDim: Dp,
    val mediumDim: Dp,
    val bigDim: Dp,
    val veryBugDim: Dp,
    val contentPadding: Dp,
    val borderWidth: Dp,
    val dialogPaddings: PaddingValues,
    val zero: Dp,
    val progressSmallWidth: Dp,
    val progressRegularWidth: Dp,
    val elevationDefault: Dp,
    val snackBarHeight: Dp
)

internal val memDimens = MemDimens(
    verySmallDim = 4.dp,
    smallDim = 8.dp,
    halfMediumDim = 12.dp,
    mediumDim = 16.dp,
    bigDim = 24.dp,
    veryBugDim = 32.dp,
    contentPadding = 16.dp,
    borderWidth = 1.dp,
    dialogPaddings = PaddingValues(top = 24.dp, start = 24.dp, end = 8.dp, bottom = 8.dp),
    zero = 0.dp,
    progressSmallWidth = 1.dp,
    progressRegularWidth = 2.dp,
    elevationDefault = 2.dp,
    snackBarHeight = 24.dp
)
