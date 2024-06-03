package com.example.projeto2_somativa.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuizDao {

    @Insert
    fun insertQuestion(question : Question)

    @Insert
    fun insertAnswer(answer : Answer)

    @Insert
    fun insertScore(score : Score)

    @Query("SELECT * FROM table_question WHERE difficulty = :difficulty")
    fun getByDifficulty(difficulty : String) : MutableList<Question>

    @Query("SELECT * FROM table_answer WHERE questionId = :questionId")
    fun getAnswerByQuestion(questionId : Int) : List<Answer>

    @Query("SELECT * FROM table_score ORDER BY score DESC LIMIT 10")
    fun getTopTen() : List<Score>

    @Query("SELECT * FROM table_question ORDER BY id DESC LIMIT 1")
    fun getLastQuestion() : Question

}