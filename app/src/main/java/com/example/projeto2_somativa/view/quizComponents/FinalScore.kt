package com.example.projeto2_somativa.view.quizComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White

@Composable
fun FinalScore(name : String, score : Int, navController: NavController) {

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

            text = "Você finalizou o Quiz!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Purple,
            modifier = Modifier.padding(20.dp)

        )

        Text(

            text = "Sua pontuação foi de: ${score}",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Purple,
            modifier = Modifier.padding(20.dp)

        )

        Button(

            onClick = {

                Singleton.addScore(name, score)
                navController.navigate(route = "Menu")
            }

        ) {

            Text(text = "OK")

        }

    }

}