package com.example.projeto2_somativa.model

import android.content.Context

object Singleton {

    private lateinit var quizDao : QuizDao

    fun setContext(context : Context){

        AppDatabase.getInstance(context)?.apply {

            quizDao = quizDao()

        }

    }

    fun addQuestion(description : String, image : String, difficulty : String){

        quizDao.insertQuestion(Question(0, description, image, difficulty))

    }

    fun addAnswer(description : String, isCorrect : Boolean, questionId : Int){

        quizDao.insertAnswer(Answer(0, description, isCorrect, questionId))

    }

    fun addScore(name : String, score : Int) {

        quizDao.insertScore(Score(0, name, score))

    }

    fun getQuestions(difficulty : String) : List<Question> {

        return quizDao.getByDifficulty(difficulty)

    }

    fun getAnswers(questionId : Int) : List<Answer> {

        return quizDao.getAnswerByQuestion(questionId)

    }

    fun getTopTen() : List<Score> {

        return quizDao.getTopTen()

    }

    fun getLast() : Question {

        return quizDao.getLastQuestion()

    }

}