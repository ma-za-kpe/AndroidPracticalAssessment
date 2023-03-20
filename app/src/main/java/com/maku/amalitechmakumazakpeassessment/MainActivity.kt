package com.maku.amalitechmakumazakpeassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.maku.amalitechmakumazakpeassessment.ui.MainApp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmalitechMakuMazakpeAssessmentTheme {
                MainApp(
                    items = listOf(
                        "First",
                        "Second",
                        "Third",
                        "Fourth",
                        "Fifth",
                        "Sixth",
                        "Seventh",
                        "Eighth",
                        "Ninth",
                        "Tenth",
                        "Eleventh",
                        "Twelve",
                        "Meditation",
                        "Timer",
                        "DropDown",
                        "Instagram"
                    )
                )
            }
        }
    }
}
