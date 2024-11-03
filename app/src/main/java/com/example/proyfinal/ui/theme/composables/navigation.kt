package com.example.proyfinal.ui.theme.composables

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


sealed class Screen(val route: String) {
    object First : Screen("first")
    object Second : Screen("second")
    object Third : Screen("third")
    object Fourth : Screen("fourth")
    object Fifth : Screen("fifth")
}
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.First.route) {
        composable(Screen.First.route) { menu_screen(navController) }
        composable(Screen.Second.route) { game_screen(navController) }
        composable(Screen.Third.route) { game_screen2(navController) }
        composable(Screen.Fourth.route) { game_screen3(navController) }
        composable(Screen.Fifth.route) { trophy_Screen(navController) }
    }
}
