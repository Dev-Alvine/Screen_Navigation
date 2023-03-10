package com.joelkanyi.composenavigation_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.joelkanyi.composenavigation_assignment.navigation.NavGraph
import com.joelkanyi.composenavigation_assignment.ui.theme.ComposeNavigationAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController= rememberNavController()
            ComposeNavigationAssignmentTheme {

                NavGraph(navController = navController)
            }
        }
    }
}