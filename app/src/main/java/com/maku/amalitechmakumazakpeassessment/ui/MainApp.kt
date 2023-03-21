package com.maku.amalitechmakumazakpeassessment.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maku.amalitechmakumazakpeassessment.ui.screen.DropDown
import com.maku.amalitechmakumazakpeassessment.ui.screen.Eight
import com.maku.amalitechmakumazakpeassessment.ui.screen.Eleventh
import com.maku.amalitechmakumazakpeassessment.ui.screen.Fifth
import com.maku.amalitechmakumazakpeassessment.ui.screen.First
import com.maku.amalitechmakumazakpeassessment.ui.screen.Fourth
import com.maku.amalitechmakumazakpeassessment.ui.screen.Instagram
import com.maku.amalitechmakumazakpeassessment.ui.screen.MainScreen
import com.maku.amalitechmakumazakpeassessment.ui.screen.Medidtation
import com.maku.amalitechmakumazakpeassessment.ui.screen.MultiSelectScreen
import com.maku.amalitechmakumazakpeassessment.ui.screen.Nineth
import com.maku.amalitechmakumazakpeassessment.ui.screen.ParallaxEffectScreen
import com.maku.amalitechmakumazakpeassessment.ui.screen.PermissionsScreen
import com.maku.amalitechmakumazakpeassessment.ui.screen.Second
import com.maku.amalitechmakumazakpeassessment.ui.screen.Seventh
import com.maku.amalitechmakumazakpeassessment.ui.screen.Sixth
import com.maku.amalitechmakumazakpeassessment.ui.screen.Tenth
import com.maku.amalitechmakumazakpeassessment.ui.screen.ThemeScreen
import com.maku.amalitechmakumazakpeassessment.ui.screen.Third
import com.maku.amalitechmakumazakpeassessment.ui.screen.Timer
import com.maku.amalitechmakumazakpeassessment.ui.screen.Twelveth
import com.maku.amalitechmakumazakpeassessment.ui.screen.bottomnav.BotomNavGraph
import com.maku.amalitechmakumazakpeassessment.ui.screen.bottomnav.BottomNaveBadges
import com.maku.amalitechmakumazakpeassessment.ui.screen.bottomnav.BottomNavigationScreens

@Composable
fun MainApp(
    items: List<String>
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AssessmentIVideoScreens.MeinScreen.route
    ) {
        // TODO: This tries to nest a bottom bar, but i think this is an anti-pattern
        BotomNavGraph(
            BottomNavigationScreens.HomeScreen.route
        )
        composable(
            route = AssessmentIVideoScreens.MeinScreen.route
        ) {
            MainScreen(
                items = items,
                // TODO: replace this with a better solution
                onNavigateToScreen = {
                    when (it) {
                        "First" -> navController.navigate(
                            AssessmentIVideoScreens.FirstScreen.route
                        )
                        "Second" -> navController.navigate(
                            AssessmentIVideoScreens.SecondScreen.route
                        )
                        "Third" -> navController.navigate(
                            AssessmentIVideoScreens.ThirdScreen.route
                        )
                        "Fourth" -> navController.navigate(
                            AssessmentIVideoScreens.FourthScreen.route
                        )
                        "Fifth" -> navController.navigate(
                            AssessmentIVideoScreens.FifthScreen.route
                        )
                        "Sixth" -> navController.navigate(
                            AssessmentIVideoScreens.SixthScreen.route
                        )
                        "Seventh" -> navController.navigate(
                            AssessmentIVideoScreens.SeventhScreen.route
                        )
                        "Eighth" -> navController.navigate(
                            AssessmentIVideoScreens.EighthScreen.route
                        )
                        "Ninth" -> navController.navigate(
                            AssessmentIVideoScreens.NinthScreen.route
                        )
                        "Tenth" -> navController.navigate(
                            AssessmentIVideoScreens.TenthScreen.route
                        )
                        "Eleventh" -> navController.navigate(
                            AssessmentIVideoScreens.EleventhScreen.route
                        )
                        "Twelve" -> navController.navigate(
                            AssessmentIVideoScreens.TwelveScreen.route
                        )
                        "Meditation" -> navController.navigate(
                            AssessmentIVideoScreens.MeditationScreen.route
                        )
                        "Timer" -> navController.navigate(
                            AssessmentIVideoScreens.TimerScreen.route
                        )
                        "DropDown" -> navController.navigate(
                            AssessmentIVideoScreens.DropDownScreen.route
                        )
                        "Instagram" -> navController.navigate(
                            AssessmentIVideoScreens.InstagramScreen.route
                        )
                        "Badges" -> navController.navigate(
                            AssessmentIVideoScreens.BottomNavBadgesScreen.route
                        )
                        "Parallax" -> navController.navigate(
                            AssessmentIVideoScreens.ParallaxEffectScreen.route
                        )

                        "MultiSelect" -> navController.navigate(
                            AssessmentIVideoScreens.MultiSelectScreen.route
                        )

                        "Permissions" -> navController.navigate(
                            AssessmentIVideoScreens.PermissionsScreen.route
                        )

                        "Theme" -> navController.navigate(
                            AssessmentIVideoScreens.ThemeScreen.route
                        )
                    }
                }
            )
        }

        composable(
            route = AssessmentIVideoScreens.FirstScreen.route
        ) {
            First()
        }
        composable(
            route = AssessmentIVideoScreens.SecondScreen.route
        ) {
            Second()
        }
        composable(
            route = AssessmentIVideoScreens.ThirdScreen.route
        ) {
            Third()
        }
        composable(
            route = AssessmentIVideoScreens.FourthScreen.route
        ) {
            Fourth()
        }
        composable(
            route = AssessmentIVideoScreens.FifthScreen.route
        ) {
            Fifth()
        }
        composable(
            route = AssessmentIVideoScreens.SixthScreen.route
        ) {
            Sixth()
        }
        composable(
            route = AssessmentIVideoScreens.SeventhScreen.route
        ) {
            Seventh()
        }
        composable(
            route = AssessmentIVideoScreens.EighthScreen.route
        ) {
            Eight()
        }
        composable(
            route = AssessmentIVideoScreens.NinthScreen.route
        ) {
            Nineth()
        }
        composable(
            route = AssessmentIVideoScreens.TenthScreen.route
        ) {
            Tenth()
        }
        composable(
            route = AssessmentIVideoScreens.EleventhScreen.route
        ) {
            Eleventh()
        }
        composable(
            route = AssessmentIVideoScreens.TwelveScreen.route
        ) {
            Twelveth()
        }
        composable(
            route = AssessmentIVideoScreens.MeditationScreen.route
        ) {
            Medidtation()
        }
        composable(
            route = AssessmentIVideoScreens.TimerScreen.route
        ) {
            Timer()
        }
        composable(
            route = AssessmentIVideoScreens.DropDownScreen.route
        ) {
            DropDown()
        }
        composable(
            route = AssessmentIVideoScreens.InstagramScreen.route
        ) {
            Instagram()
        }
        composable(
            route = AssessmentIVideoScreens.BottomNavBadgesScreen.route
        ) {
            BottomNaveBadges(
                navController
            )
        }

        composable(
            route = AssessmentIVideoScreens.ParallaxEffectScreen.route
        ) {
            ParallaxEffectScreen()
        }

        composable(
            route = AssessmentIVideoScreens.MultiSelectScreen.route
        ) {
            MultiSelectScreen()
        }

        composable(
            route = AssessmentIVideoScreens.PermissionsScreen.route
        ) {
            PermissionsScreen()
        }

        composable(
            route = AssessmentIVideoScreens.ThemeScreen.route
        ) {
            ThemeScreen()
        }
    }
}

// TODO: get this data class into its won class
sealed class AssessmentIVideoScreens(val route: String) {
    object MeinScreen : AssessmentIVideoScreens("main_screen")
    object FirstScreen : AssessmentIVideoScreens("first_screen")
    object SecondScreen : AssessmentIVideoScreens("second_screen")
    object ThirdScreen : AssessmentIVideoScreens("third_screen")
    object FourthScreen : AssessmentIVideoScreens("fourth_screen")
    object FifthScreen : AssessmentIVideoScreens("fifth_screen")
    object SixthScreen : AssessmentIVideoScreens("sixth_screen")
    object SeventhScreen : AssessmentIVideoScreens("seventh_screen")
    object EighthScreen : AssessmentIVideoScreens("eight_screen")
    object NinthScreen : AssessmentIVideoScreens("nine_screen")
    object TenthScreen : AssessmentIVideoScreens("ten_screen")
    object EleventhScreen : AssessmentIVideoScreens("eleven_screen")
    object TwelveScreen : AssessmentIVideoScreens("twelve_screen")
    object MeditationScreen : AssessmentIVideoScreens("meditation_screen")
    object TimerScreen : AssessmentIVideoScreens("timer_screen")
    object DropDownScreen : AssessmentIVideoScreens("drop_down_screen")
    object InstagramScreen : AssessmentIVideoScreens("insta_screen")
    object BottomNavBadgesScreen : AssessmentIVideoScreens("badges_screen")
    object ParallaxEffectScreen : AssessmentIVideoScreens("parallax_screen")
    object MultiSelectScreen : AssessmentIVideoScreens("multi_select_screen")
    object PermissionsScreen : AssessmentIVideoScreens("permissions_screen")
    object ThemeScreen : AssessmentIVideoScreens("theme_screen")
}
