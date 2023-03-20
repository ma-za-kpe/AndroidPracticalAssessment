package com.maku.amalitechmakumazakpeassessment.ui.screen.bottomnav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

const val bottomGraphNavigationRoute = "bottom_graph_route"

fun NavGraphBuilder.BotomNavGraph(
    startDestination: String
) {
    // TODO: add sealed data class to handle nav routes
    navigation(
        route = bottomGraphNavigationRoute,
        startDestination = startDestination
    ) {
        composable(
            route = startDestination
        ) {
            HomesScreen()
        }
        composable(
            route = BottomNavigationScreens.ChatScreen.route
        ) {
            ChatScreen()
        }
        composable(
            route = BottomNavigationScreens.SettingsScreen.route
        ) {
            SettingsScreen()
        }
    }
}

sealed class BottomNavigationScreens(val route: String) {
    object HomeScreen : BottomNavigationScreens("home")
    object ChatScreen : BottomNavigationScreens("chat")
    object SettingsScreen : BottomNavigationScreens("settings")
}
