package com.example.projeto2_somativa.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.ui.theme.Black
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.view.menuComponents.DifficultySelector

@OptIn(ExperimentalMaterial3Api::class)
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

            text = "Bem-vindo ao Quiz!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Purple,
            modifier = Modifier.padding(bottom = 10.dp)

        )

        Text(

            text = "Tema: Conhecimentos Gerais",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Purple,
            modifier = Modifier.padding(bottom = 50.dp)

        )

        DifficultySelector() { selectedDifficulty ->

            difficulty = selectedDifficulty

        }

        Box(

            modifier = Modifier
                .size(300.dp, 60.dp)
                .padding(top = 10.dp)

        )
        {

            TextField(

                value = playerName,
                placeholder = { Text(text = "Digite o seu nome")},
                onValueChange = { name -> playerName = name },
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(5.dp))
                    .border(1.dp, Black),
                colors = TextFieldDefaults.textFieldColors(containerColor = White),
                label = { Text(text = "Nome") }

            )

        }

        Row(

            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(top = 70.dp)

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