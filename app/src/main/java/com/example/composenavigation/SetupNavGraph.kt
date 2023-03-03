package com.example.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.Second.route + "/{myPerson}",
            arguments = listOf(
                navArgument("myPerson") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            )
        ) {
            val myPerson = it.arguments?.getString("myPerson")
            SecondScreen(
                navController = navController,
                personAsString = myPerson.toString()
            )
        }
    }
}
/**
 * 1- for all screens that we have, we have to write these composable functions
 * 2- we define nullable = true so if in HomeScreen we don't write age or name -> app will not be crashed :) */