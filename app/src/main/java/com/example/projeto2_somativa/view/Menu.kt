package com.example.projeto2_somativa.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.ui.theme.Purple

@Composable
fun Menu(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Welcome to the Quiz!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Purple,
            modifier = Modifier.padding(bottom = 16.dp) 
        )
        
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Button(
                onClick = { navController.navigate(route = "Quiz") },
                colors = ButtonDefaults.buttonColors(containerColor = Purple, contentColor = White),
                modifier = Modifier.size(150.dp, 55.dp)
            ) {

                Text(
                    text = "Start Quiz",
                    fontSize = 17.sp
                )

            }

            Button(
                onClick = { navController.navigate(route = "LeaderBoard") },
                colors = ButtonDefaults.buttonColors(containerColor = Purple, contentColor = White),
                modifier = Modifier.size(150.dp, 55.dp)
            ) {

                Text(
                    text = "LeaderBoard",
                    fontSize = 17.sp
                )

            }

        }

    }

}