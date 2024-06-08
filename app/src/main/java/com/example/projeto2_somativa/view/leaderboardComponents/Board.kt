package com.example.projeto2_somativa.view.leaderboardComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.projeto2_somativa.model.Score
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projeto2_somativa.ui.theme.Purple
import com.example.projeto2_somativa.ui.theme.White

@Composable
fun Board(topTen: List<Score>, navController: NavController) {

    Column(

        modifier = Modifier
            .padding(20.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(White)
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(

            text = "Top 10 pontuadores",
            modifier = Modifier
                .padding(15.dp, 10.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center

        )


        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp)

        ) {

            Text(

                text = "Nome:",
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp, end = 10.dp),
                textAlign = TextAlign.Left,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold

            )

            Text(

                text = "Score:",
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp, end = 20.dp),
                textAlign = TextAlign.Right,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold

            )

        }

        topTen.forEachIndexed { index, score ->

            Row(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp)

            ) {

                Text(

                    text = "${index + 1}. " + score.name,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 25.dp, end = 10.dp),
                    textAlign = TextAlign.Left,
                    fontSize = 20.sp

                )

                Text(

                    text = score.score.toString(),
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp, end = 25.dp),
                    textAlign = TextAlign.Right,
                    fontSize = 20.sp

                )

            }

        }

        Button(

            onClick = { navController.navigate("Menu") },
            colors = ButtonDefaults.buttonColors(containerColor = Purple, contentColor = Color.White),
            modifier = Modifier
                .size(300.dp, 50.dp)
                .padding(top = 10.dp, bottom = 5.dp)

        ) {

            Text(text = "OK")

        }

    }

}
