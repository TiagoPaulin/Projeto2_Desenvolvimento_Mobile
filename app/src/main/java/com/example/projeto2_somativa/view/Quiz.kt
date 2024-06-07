package com.example.projeto2_somativa.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White
import com.example.projeto2_somativa.view.quizComponents.FinalScore
import com.example.projeto2_somativa.view.quizComponents.QuestionBody
import com.example.projeto2_somativa.view.quizComponents.Timer


@Composable
fun Quiz(navController: NavController, difficulty : String, name : String) {

    var questions by remember { mutableStateOf(Singleton.getQuestions(difficulty)) }
    var index by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var startTimer by remember { mutableStateOf(true) }
    var questionTime by remember { mutableStateOf(30) }

    Column (

        modifier = Modifier
            .background(Purple)
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        if (showResult) {

            FinalScore(name = name, score = score, navController = navController)

        } else {

            Row (

                horizontalArrangement = Arrangement.spacedBy(10.dp),

            ){

                Text(

                    text = "PONTOS: ${score}",
                    fontWeight = FontWeight.Bold,
                    color = White,
                    textAlign = TextAlign.Left

                )

                Timer(startTimer) {time ->

                    questionTime = time

                }

                Text(

                    text = questionTime.toString(),
                    fontWeight = FontWeight.Bold,
                    color = White,
                    textAlign = TextAlign.Right

                )

            }

            if (index < questions.size) {

                val question = questions[index]

                QuestionBody(question = question) { isCorrect ->

                    startTimer = false

                    if (isCorrect) {

                        val multiplier = (questionTime / 10.0f)
                        score += (100 * multiplier).toInt()

                    }

                    index ++

                    if (index >= questions.size){

                        showResult = true

                    }

                }

                startTimer = true

            }

        }

    }

}