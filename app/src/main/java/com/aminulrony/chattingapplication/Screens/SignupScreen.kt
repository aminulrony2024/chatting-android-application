package com.aminulrony.chattingapplication.Screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.aminulrony.chattingapplication.DestinationScreen

@Composable
fun SignupScreen(navController: NavController) {
    Text(text="Click here to navigate to other screen", modifier = Modifier.clickable {
        navController.navigate(DestinationScreen.Login.route)
    })
}