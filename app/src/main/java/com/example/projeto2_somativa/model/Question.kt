package com.example.projeto2_somativa.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_question")
data class Question(

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val description : String,
    val image : String,
    val difficulty : String,


)
