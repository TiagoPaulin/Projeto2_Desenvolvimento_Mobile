package com.example.projeto2_somativa.model

import androidx.room.Database
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Question::class, Answer::class, Score::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun quizDao() : QuizDao

    companion object{
        private var instance: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase?{

            if (instance == null){

                synchronized(AppDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_data.sqlite"
                    )
                        .allowMainThreadQueries()
                        .build()

                }

            }

            return instance

        }
    }

}