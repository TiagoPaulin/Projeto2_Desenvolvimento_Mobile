package com.example.projeto2_somativa.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White
import com.example.projeto2_somativa.view.leaderboardComponents.Board

@Composable
fun LeaderBoard(navController: NavController) {

    var topTen = Singleton.getTopTen()
    
    Column(
        modifier = Modifier
            .background(Purple)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        
    ) {

//        FloatingActionButton(
//            onClick = { navController.navigate("Menu") },
//            containerColor = Purple,
//            contentColor = White
//        ) {
//
//            Text(text = "Menu")
//
//        }

        if (topTen.isEmpty()){
            
            Text(
                
                text = "Não há registro de pontuação",
                color = Color.Black,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
                
                )
            
        } else {
            
            Board(topTen = topTen)
            
        }

    }

}