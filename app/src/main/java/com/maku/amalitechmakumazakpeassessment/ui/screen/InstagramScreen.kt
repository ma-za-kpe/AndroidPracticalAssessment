package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.maku.amalitechmakumazakpeassessment.ui.screen.insta.ProfileScreen
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Instagram() {
    ProfileScreen()
}

@Preview(showBackground = true)
@Composable
fun InstagramUiInComposeUiPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Instagram()
    }
}
