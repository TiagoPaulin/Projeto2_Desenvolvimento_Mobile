package com.example.projeto2_somativa.view.quizComponents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun Timer(startTimer: Boolean, returnTime: (Int) -> Unit) {

    var time by remember { mutableStateOf(30) }

    LaunchedEffect(startTimer) {

        while (time >= 0) {

            if (!startTimer || time == 0){

                time = 30
                returnTime(time)

            }

            delay(1000)
            time--
            returnTime(time)

        }

    }

}


