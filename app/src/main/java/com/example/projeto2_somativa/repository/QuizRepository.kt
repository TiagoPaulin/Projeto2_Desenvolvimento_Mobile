package com.example.projeto2_somativa.repository

import com.example.projeto2_somativa.model.Answer
import com.example.projeto2_somativa.model.Question
import com.example.projeto2_somativa.model.Score

interface QuizRepository {

    fun insertQuestion(question : Question)

    fun insertAnswer(answer : Answer)

    fun insertScore(score : Score)

    fun getByDifficulty(difficulty : String) : List<Question>

    fun getAnswerByQuestion(questionId : Int) : List<Answer>

    fun getTopTen() : List<Score>

}