package com.example.projeto2_somativa.view.quizComponents

import android.widget.ImageView
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.bumptech.glide.Glide

@Composable
fun ImageLoader(imageUrl: String) {

    Box(

        modifier = Modifier
            .size(350.dp, 250.dp)
            .padding(15.dp, 5.dp, 15.dp, 5.dp)
            .clip(RoundedCornerShape(7.dp))
            .border(2.dp, Color.Black)

    ) {

        AndroidView(

            factory = { context ->
                ImageView(context).apply {
                    scaleType = ImageView.ScaleType.CENTER_CROP
                }
            },

            update = { imageView ->

                Glide.with(imageView.context)
                    .load(imageUrl)
                    .into(imageView)

            },

            modifier = Modifier.fillMaxSize()

        )
    }
}