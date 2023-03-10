package com.joelkanyi.composenavigation_assignment.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.joelkanyi.composenavigation_assignment.navigation.Screen


@Composable
fun Home_Screen(
    navController: NavController,
) {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                navController.navigate(Screen.ScreenB.route)
            }) {
            Text(text = "Go to Detail Screen")
        }
    }
}