package com.example.projeto2_somativa.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "table_answer",
    foreignKeys = [ForeignKey(
        entity = Question::class,
        parentColumns = ["id"],
        childColumns = ["questionId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index(value = ["questionId"])]
)
data class Answer(

    @PrimaryKey(autoGenerate = true)
    val answerId : Int,
    val questionId : Int,
    val text : String,
    val isCorrect : Boolean

)
