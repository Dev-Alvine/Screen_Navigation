package com.joelkanyi.composenavigation_assignment.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

import com.joelkanyi.composenavigation_assignment.Screen.Detail_Screen
import com.joelkanyi.composenavigation_assignment.Screen.Home_Screen
import com.joelkanyi.composenavigation_assignment.Screen.Rating_Screen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination =Screen.Home.route
    ){

        composable(route= Screen.Home.route){
            Home_Screen(navController = navController)
        }

        composable(route =Screen.Detail.route){
            Detail_Screen(navController = navController)
        }

        composable(route= Screen.Rating.route,
            arguments= listOf(
                navArgument(name = ID){
                    type= NavType.FloatType
                    defaultValue=1f
                }
            )
        )
        {

            Rating_Screen(
                navController = navController,
               id = it.arguments?.getFloat(ID) ?:1f
            )
        }
    }

}

