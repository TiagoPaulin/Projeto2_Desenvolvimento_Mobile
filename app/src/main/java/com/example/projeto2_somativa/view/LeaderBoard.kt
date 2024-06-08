package com.example.projeto2_somativa.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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

        if (topTen.isEmpty()){
            
            Column(

                modifier = Modifier
                    .padding(20.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(White)
                    .size(400.dp, 250.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

                Text(

                    text = "Não há registro de pontuação",
                    color = Color.Black,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center

                )

                Button(

                    onClick = { navController.navigate("Menu") },
                    colors = ButtonDefaults.buttonColors(containerColor = Purple, contentColor = Color.White),
                    modifier = Modifier
                        .size(300.dp, 50.dp)
                        .padding(top = 10.dp, bottom = 5.dp)

                ) {

                    Text(text = "OK")

                }

            }
            
        } else {
            
            Board(topTen = topTen, navController)
            
        }

    }

}