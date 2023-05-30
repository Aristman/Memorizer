package ru.marslab.memorizer.common.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import ru.marslab.memorizer.R

private val appBaseFontMedium = FontFamily(Font(R.font.archivo_medium))
private val appBaseFontRegular = FontFamily(Font(R.font.archivo))
private val appBaseFontBold = FontFamily(Font(R.font.archivo_bold))
private val appBaseFontSemiBold = FontFamily(Font(R.font.archivo_semibold))

private val title = TextStyle(
    fontFamily = appBaseFontBold,
    fontSize = 15.sp
)

private val body1 = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 14.sp
)

private val body2 = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 15.sp
)

private val subtitle1 = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 15.sp
)

private val h1 = TextStyle(
    fontFamily = appBaseFontBold,
    fontSize = 24.sp
)

private val h2 = TextStyle(
    fontFamily = appBaseFontMedium,
    fontSize = 20.sp
)

private val h3 = TextStyle(
    fontFamily = appBaseFontMedium,
    fontSize = 16.sp
)

private val caption = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 12.sp
)

private val snackBar = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 15.sp
)

private val toolBar = TextStyle(
    fontFamily = appBaseFontRegular,
    fontSize = 14.sp
)

private val button = TextStyle(
    fontFamily = appBaseFontMedium,
    fontSize = 15.sp
)

data class MemTypes(
    val title: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val subtitle1: TextStyle,
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val caption: TextStyle,
    val snackBar: TextStyle,
    val toolBar: TextStyle,
)

internal val memTypes = MemTypes(
    title = title,
    body1 = body1,
    body2 = body2,
    subtitle1 = subtitle1,
    h1 = h1,
    h2 = h2,
    h3 = h3,
    h4 = h3,
    h5 = h3,
    h6 = h3,
    caption = caption,
    snackBar = snackBar,
    toolBar = toolBar
)

val materialThemeTypography = Typography(
    h1 = h1,
    h2 = h2,
    h3 = h3,
    h4 = TextStyle(),
    h5 = TextStyle(),
    h6 = TextStyle(),
    subtitle1 = subtitle1,
    subtitle2 = subtitle1,
    body1 = body1,
    body2 = body2,
    button = button,
//    overline = TextStyle(),
    caption = caption
)
