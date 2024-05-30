package com.example.projeto2_somativa.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White

@Composable
fun Quiz(navController: NavController) {

    Column {

        FloatingActionButton(
            onClick = { navController.navigate("Menu") },
            containerColor = Purple,
            contentColor = White
        ) {

            Text(text = "Menu")

        }

        Text(text = "quiz")

    }

}