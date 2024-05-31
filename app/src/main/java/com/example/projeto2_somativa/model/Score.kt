package com.example.projeto2_somativa.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_score")
data class Score(

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val score : Long,
    val name : String

)
