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

        var start = startTimer

        while (time > 0) {

            if (!start){

                time = 30
                returnTime(time)
                start = true

            }

            delay(1000)
            time--
            returnTime(time)

        }

    }

}


