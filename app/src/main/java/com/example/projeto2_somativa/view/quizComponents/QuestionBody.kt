package com.example.projeto2_somativa.view.quizComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projeto2_somativa.model.Question
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White

@Composable
fun QuestionBody(question : Question){
    
    var answers = Singleton.getAnswers(question.id)
    
    Column(

        modifier =  Modifier
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

        answers.forEach { answer ->

            Box(

                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Purple)
                    .size(325.dp, 60.dp),
                contentAlignment = Alignment.CenterStart

            ) {

                Text(

                    text = answer.description,
                    modifier = Modifier.padding(10.dp),
                    color = White

                )

            }

        }
        
    }
    
}