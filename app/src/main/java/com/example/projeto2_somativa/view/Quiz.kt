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
    
    var lastQuestion = Singleton.getLast()
    
    var answers = Singleton.getAnswers(lastQuestion.id)
    
    Column {
        
        Text(text = "descricao: " + lastQuestion.description + "image: " + lastQuestion.image + "Dificuldade: " + lastQuestion.difficulty)
        
        answers.forEach { answer ->
            
            Text(text = "descricao: " + answer.description + "isCorrect: " + (answer.isCorrect).toString())
            
        }
        
    }

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