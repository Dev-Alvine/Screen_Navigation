package com.joelkanyi.composenavigation_assignment.navigation

import java.net.IDN

const val ID ="id"
sealed class Screen(val route: String) {
    object Home : Screen(route = "Home_screen")
    object Detail: Screen(route = "Detail_Screen")

    object Rating: Screen(route = "Rating_Screen/{$ID}")
    {
        fun  passArgument(id: Int):String{
            return "Rating_Screen/$id"
        }
    }

    }

