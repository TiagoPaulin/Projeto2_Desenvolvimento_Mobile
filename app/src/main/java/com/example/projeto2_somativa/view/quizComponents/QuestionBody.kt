package com.example.projeto2_somativa.view.quizComponents

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projeto2_somativa.model.Question
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Green
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.Red
import com.example.projeto2_somativa.ui.theme.White
import kotlinx.coroutines.delay

@Composable
fun QuestionBody(question: Question, onConfirm: (Boolean) -> Unit, startTimer: (Boolean) -> Unit) {

    val answers = Singleton.getAnswers(question.id)

    var selectedAnswerIndex by remember { mutableStateOf(-1) }
    var isCorrect by remember { mutableStateOf(false) }
    var confirmed by remember { mutableStateOf(false) }
    var start by remember { mutableStateOf(false) }
    var visibleAnswers by remember { mutableStateOf(emptyList<Boolean>()) }

    LaunchedEffect(question) {

        visibleAnswers = List(answers.size) { false }
        answers.forEachIndexed { index, _ ->

            delay(500)
            visibleAnswers = visibleAnswers.toMutableList().apply {
                this[index] = true

            }

        }

        start = true
        startTimer(start)

    }

    Column(

        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        ImageLoader(imageUrl = question.image)

        Text(
            text = question.description,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            modifier = Modifier.padding(10.dp, 0.dp),
            textAlign = TextAlign.Left

        )

        answers.forEachIndexed { index, answer ->

            val backgroundColor = when {
                confirmed && selectedAnswerIndex == index && !answer.isCorrect -> Red
                confirmed && selectedAnswerIndex == index && answer.isCorrect -> Green
                confirmed && answer.isCorrect -> Green
                selectedAnswerIndex == index -> White
                else -> Purple

            }

            val textColor = when {

                confirmed && selectedAnswerIndex == index -> White
                selectedAnswerIndex == index -> Purple
                else -> White

            }

            AnimatedVisibility(

                visible = visibleAnswers.getOrElse(index) { false },
                enter = slideInHorizontally(
                    initialOffsetX = { fullWidth -> fullWidth }
                )

            ) {

                Box(

                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .border(1.dp, Color.Black)
                        .background(backgroundColor)
                        .size(325.dp, 65.dp)
                        .clickable {
                            if (!confirmed) {
                                selectedAnswerIndex = index
                                isCorrect = answer.isCorrect
                            }
                        },
                    contentAlignment = Alignment.CenterStart

                ) {

                    Text(

                        text = answer.description,
                        modifier = Modifier.padding(10.dp),
                        color = textColor

                    )

                }

            }

        }

        Button(

            onClick = {
                if (selectedAnswerIndex != -1) {
                    confirmed = true
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Purple, contentColor = Color.White),
            modifier = Modifier
                .size(300.dp, 50.dp)
                .padding(top = 10.dp, bottom = 5.dp)

        ) {

            Text(text = "Confirmar")

        }

    }

    LaunchedEffect(confirmed) {

        if (confirmed) {

            start = false
            startTimer(start)
            delay(1000)
            confirmed = false
            selectedAnswerIndex = -1
            onConfirm(isCorrect)
            isCorrect = false

        }

    }

}
