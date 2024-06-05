package com.example.projeto2_somativa.view

import android.widget.ImageView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.bumptech.glide.Glide
import com.example.projeto2_somativa.R
import com.example.projeto2_somativa.model.Answer
import com.example.projeto2_somativa.model.Question
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White
import com.example.projeto2_somativa.view.quizComponents.QuestionBody
import kotlin.random.Random

@Composable
fun Quiz(navController: NavController, difficulty : String, name : String) {

    var questions by remember { mutableStateOf(Singleton.getQuestions(difficulty)) }
    var index by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    Column (

        modifier = Modifier
            .background(Purple)
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        if (showResult) {

            Text(text = "Sua pontuação: " + score)

        } else {

            Text(text = score.toString())

            if (index < questions.size) {

                val question = questions[index]

                QuestionBody(question = question) { isCorrect ->

                    if (isCorrect) {

                        score += 100

                    }

                    index ++

                    if (index >= questions.size){

                        showResult = true
                        Singleton.addScore(name, score)

                    }

                }

            }

        }

    }

}