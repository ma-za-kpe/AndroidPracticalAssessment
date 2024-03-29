package com.maku.amalitechmakumazakpeassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.maku.amalitechmakumazakpeassessment.ui.MainApp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            AmalitechMakuMazakpeAssessmentTheme {
                MainApp(
                    items = list
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MainAppPreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            MainApp(
                items = list
            )
        }
    }
}

val list = listOf(
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
    "Instagram",
    "Badges",
    "Parallax",
    "MultiSelect",
    "Permissions",
    "Theme",
    "AnimatedCounter",
    "DeepLinks",
    "LayGrid",
    "Drawer",
    "BottomSheet",
    "Pagination",
    "MotionLayout",
    "ScreenSizes"
)
