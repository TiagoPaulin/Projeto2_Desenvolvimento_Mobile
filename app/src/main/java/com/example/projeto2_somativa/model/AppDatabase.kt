package com.example.projeto2_somativa.model

import androidx.room.Database
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Question::class, Answer::class, Score::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract val quizDao : QuizDao

    companion object{
        @Volatile
        private var INSTANCE : AppDatabase? = null
        fun getInstance(context: Context):AppDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_database.sqlite"
                    ).build()
                }
                return instance
            }
        }

    }

}