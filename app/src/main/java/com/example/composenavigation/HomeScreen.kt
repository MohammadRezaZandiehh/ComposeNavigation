package com.example.composenavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = "My Home Screen", color = Color.Blue
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {
            val name = "Mohammad Reza"
            val age = "23"
            navController.navigate(route = Screen.Second.withArg(name, age))
        }) {
            Text(text = "Go To Second Screen")
        }
    }
}

/**
 * if in line : navController.navigate(Screen.Second.route + "?params=$name")
 * we don't write the "?params=$name" --> it will not be crashed and just show the defaultValue = "Params Is Empty"
 * that we specify in SetupNavGraph in the textView in SecondScreen*/