package com.example.composenavigation

sealed class Screen (val route: String){
object Home: Screen(route = "home_screen")
object Second: Screen(route = "second_screen")
}


/**
 * we manage all screen pages in here */