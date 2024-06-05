package com.example.projeto2_somativa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.projeto2_somativa.model.Singleton
import com.example.projeto2_somativa.ui.theme.Projeto2_SomativaTheme
import com.example.projeto2_somativa.view.LeaderBoard
import com.example.projeto2_somativa.view.Menu
import com.example.projeto2_somativa.view.Quiz

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Singleton.setContext(this)

//        Singleton.loadQuestionsFromJSON()


        setContent {
            Projeto2_SomativaTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Menu") {

                    composable(route = "Menu") {

                        Menu(navController)

                    }

                    composable(route = "Quiz/{difficulty}", arguments = listOf(

                        navArgument("difficulty}") {

                            type = NavType.StringType
                            defaultValue = "fácil"
                            nullable = true

                        }

                    )

                    ) {

                        Quiz(navController, difficulty = it.arguments?.getString("difficulty") ?: "fácil")

                    }

                    composable(route = "LeaderBoard") {

                        LeaderBoard(navController)

                    }

                }

            }
        }
    }
}
