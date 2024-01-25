package zw.apkmechanic.gentleman.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import zw.apkmechanic.gentleman.R

// Set of Material typography styles to start with

val Segoe = FontFamily(
    Font(R.font.segoe_ui, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.segoe_ui_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.segoe_ui_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.segoe_ui_bold_italic, FontWeight.Bold, FontStyle.Italic),

    )
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontSize = 17.sp,
        fontFamily = Segoe,
        fontWeight = FontWeight.Bold,
        color = MainColor
    ),

    headlineLarge = TextStyle(
        fontFamily = Segoe,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,

    ),
    headlineSmall = TextStyle(fontSize = 22.sp,
        letterSpacing =0.5.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = Segoe,
      )
    ,
    labelLarge = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = Segoe,
        ),
       labelSmall = TextStyle(
            fontFamily = Segoe,
    fontWeight = FontWeight.Normal,
           color = Color.Gray,
    fontSize = 15.sp,
    lineHeight = 16.sp,

)

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)