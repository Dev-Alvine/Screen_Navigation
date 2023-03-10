package com.joelkanyi.composenavigation_assignment.navigation

sealed class Screen(val route: String) {
    object ScreenA : Screen(route = "Home_screen")
    object ScreenB: Screen(route = "Detail_Screen")

    object ScreenC: Screen(route = "Rating_Screen")

    }

