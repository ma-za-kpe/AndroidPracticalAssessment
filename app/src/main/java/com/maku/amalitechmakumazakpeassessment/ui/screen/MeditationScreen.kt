package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Medidtation() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun MeditationUiPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Medidtation()
    }
}
