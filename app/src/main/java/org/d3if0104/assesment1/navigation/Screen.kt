package org.d3if0104.assesment1.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("MainScreen")
    data object About: Screen("About")

}