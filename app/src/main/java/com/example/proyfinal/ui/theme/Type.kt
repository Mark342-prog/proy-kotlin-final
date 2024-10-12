package com.example.proyfinal.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.proyfinal.R
import androidx.compose.ui.graphics.Color

val Xenosphere = FontFamily(
    Font(R.font.xenosphere)
)
val Xenosphere_alt = FontFamily(
    Font(R.font.xenosphere_alt)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Xenosphere,
        fontWeight = FontWeight.Bold,
        fontSize = 100.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Xenosphere,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        color = Color.White
    ),
    labelSmall = TextStyle(
        fontFamily = Xenosphere,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Xenosphere,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)