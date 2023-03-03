package com.example.composenavigation

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Second : Screen(route = "second_screen")

    fun withArg(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
    }
}


/**
 * 1- we manage all screen pages in here
 * 2- "vararg": when we don't know exactly we have how many parameters that we want to send to this function
 * 3- args.forEach {
       append("/$it")    --> For each input of withArg , do this operation.
           }
*/