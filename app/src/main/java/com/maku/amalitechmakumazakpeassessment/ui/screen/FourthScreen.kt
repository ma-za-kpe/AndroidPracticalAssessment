package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.maku.amalitechmakumazakpeassessment.R
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Fourth() {
    val fontFamily = FontFamily(
        Font(
            R.font.dosis_bold,
            FontWeight.Bold
        ),
        Font(
            R.font.dosis_extrabold,
            FontWeight.ExtraBold
        ),
        Font(
            R.font.dosis_extralight,
            FontWeight.ExtraLight
        ),
        Font(
            R.font.dosis_light,
            FontWeight.Light
        ),
        Font(
            R.font.dosis_medium,
            FontWeight.Medium
        ),
        Font(
            R.font.dosis_regular,
            FontWeight.Normal
        ),
        Font(
            R.font.dosis_semibold,
            FontWeight.SemiBold
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xff101010)
            )
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = ParagraphStyle(
                        lineHeight = 30.sp
                    )
                ) {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Blue
                        )
                    ) {
                        append("Maku ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.Cyan
                        )
                    ) {
                        append(".....\n")
                    }
                    append("in hello compose")
                }
            },
            color = Color.White,
            fontSize = 40.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FourthPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Fourth()
    }
}
