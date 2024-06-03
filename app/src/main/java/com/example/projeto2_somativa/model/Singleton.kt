package com.example.projeto2_somativa.model

import android.content.Context
import com.example.projeto2_somativa.feed
import org.json.JSONArray

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

    fun getQuestions(difficulty : String) : MutableList<Question> {

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

    fun loadQuestionsFromJSON() {
        val jsonString = feed()
        val jsonArray = JSONArray(jsonString)

        for (i in 0 until jsonArray.length()) {
            val jsonObject = jsonArray.getJSONObject(i)
            val question = Question(
                0,
                jsonObject.getString("description"),
                jsonObject.getString("image"),
                jsonObject.getString("difficulty")
            )

            quizDao.insertQuestion(question)
            val lastQuestion = quizDao.getLastQuestion()

            val answersArray = jsonObject.getJSONArray("answers")
            for (j in 0 until answersArray.length()) {
                val answerObject = answersArray.getJSONObject(j)
                val answer = Answer(
                    0,
                    answerObject.getString("description"),
                    answerObject.getBoolean("isCorrect"),
                    lastQuestion.id
                )
                quizDao.insertAnswer(answer)
            }
        }
    }

}