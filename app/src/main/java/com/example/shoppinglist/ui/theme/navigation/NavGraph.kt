package com.example.shoppinglist.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shoppinglist.ui.theme.screen.ProfileScreen
import com.example.shoppinglist.ShoppingListApp
import com.example.shoppinglist.ui.theme.screen.SettingScreen

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home") { ShoppingListApp() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingScreen() }
    }
}