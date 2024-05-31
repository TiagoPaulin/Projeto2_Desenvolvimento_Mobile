package com.example.projeto2_somativa.service

import com.example.projeto2_somativa.model.Answer
import com.example.projeto2_somativa.model.Question
import com.example.projeto2_somativa.model.QuizDao
import com.example.projeto2_somativa.model.Score
import com.example.projeto2_somativa.repository.QuizRepository

class QuizService(

    private val dao : QuizDao

) : QuizRepository {
    override fun insertQuestion(question: Question) {
        dao.insertQuestion(question)
    }

    override fun insertAnswer(answer: Answer) {
        dao.insertAnswer(answer)
    }

    override fun insertScore(score: Score) {
        dao.insertScore(score)
    }

    override fun getByDifficulty(difficulty: String): List<Question> {
        return dao.getByDifficulty(difficulty)
    }

    override fun getAnswerByQuestion(questionId: Int): List<Answer> {
        return dao.getAnswerByQuestion(questionId)
    }

    override fun getTopTen(): List<Score> {
        return dao.getTopTen()
    }

}