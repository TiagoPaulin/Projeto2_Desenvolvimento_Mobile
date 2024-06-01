package com.example.projeto2_somativa.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.projeto2_somativa.model.Answer
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White

@Composable
fun Quiz(navController: NavController) {

    Singleton.addQuestion("Quanto e 2 + 2?", "link", "media")

    var lastQuestion = Singleton.getLast()

    Singleton.addAnswer("2", true, lastQuestion.id)
    Singleton.addAnswer("8", false, lastQuestion.id)
    Singleton.addAnswer("3", false, lastQuestion.id)
    Singleton.addAnswer("12", false, lastQuestion.id)

    Singleton.addQuestion("Quanto e 4 + 4?", "link", "media")

    lastQuestion = Singleton.getLast()

    Singleton.addAnswer("25", false, lastQuestion.id)
    Singleton.addAnswer("8", true, lastQuestion.id)
    Singleton.addAnswer("30", false, lastQuestion.id)
    Singleton.addAnswer("12", false, lastQuestion.id)

    var questions = Singleton.getQuestions("media")

    var answers = mutableListOf<Answer>()

    questions.forEach { question ->

        answers.addAll(Singleton.getAnswers(question.id))

    }

    Column {

        questions.forEach { question ->

            Text(text = question.description)

            answers.forEach { answer ->

                Text(text = answer.description)

            }

        }

    }

//    Column {
//
//        FloatingActionButton(
//            onClick = { navController.navigate("Menu") },
//            containerColor = Purple,
//            contentColor = White
//        ) {
//
//            Text(text = "Menu")
//
//        }
//
//        Text(text = "quiz")
//
//    }

}