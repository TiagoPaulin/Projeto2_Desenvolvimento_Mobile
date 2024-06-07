package com.example.projeto2_somativa.view

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.view.menuComponents.DifficultySelector

@Composable
fun Menu(navController: NavController) {

    val context = LocalContext.current

    var difficulty by remember { mutableStateOf("") }
    var playerName by remember { mutableStateOf("") }

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

        DifficultySelector() { selectedDifficulty ->

            difficulty = selectedDifficulty

        }

        Box(

            modifier = Modifier
                .size(300.dp, 60.dp)

        )
        {

            TextField(

                value = playerName,
                placeholder = { Text(text = "Digite o seu nome")},
                onValueChange = { name -> playerName = name },
                modifier = Modifier
                    .fillMaxSize(),
                label = { Text(text = "Nome") }

            )

        }

        Row(

            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(20.dp)

        ) {

            Button(

                onClick = {

                    if (playerName.isNullOrEmpty() || difficulty.isNullOrEmpty()){

                        Toast.makeText(context, "Selecione uma dificuldade e preencha o campo de nome", Toast.LENGTH_SHORT).show()

                    } else {

                        navController.navigate(route = "Quiz/${difficulty}/${playerName}")

                    }

                },
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