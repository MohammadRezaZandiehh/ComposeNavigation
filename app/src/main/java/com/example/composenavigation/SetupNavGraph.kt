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
            route = Screen.Second.route + "?params={params}",
            arguments = listOf(navArgument("params") {
                type = NavType.StringType
                defaultValue = "Params Is Empty"
            })
        ) {
            val params = it.arguments?.getString("params")
            params?.let { p ->
                SecondScreen(
                    navController = navController,
                    params = p
                )
            }
        }
    }
}
/**
 * for all screens that we have, we have to write these composable functions
 *  */