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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.bumptech.glide.Glide
import com.example.projeto2_somativa.R
import com.example.projeto2_somativa.model.Answer
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White
import com.example.projeto2_somativa.view.quizComponents.QuestionBody

@Composable
fun Quiz(navController: NavController) {
    
    var lastQuestion = Singleton.getLast()

    Column (

        modifier = Modifier
            .background(Purple)
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){

//        FloatingActionButton(
//            onClick = { navController.navigate("Menu") },
//            containerColor = Purple,
//            contentColor = White
//        ) {
//
//            Text(text = "Menu")
//
//        }

        QuestionBody(question = lastQuestion)

    }

}