package com.example.shoppinglist.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shoppinglist.ui.theme.screen.ProfileScreen
import com.example.shoppinglist.ShoppingListApp
import com.example.shoppinglist.ui.theme.screen.SettingScreen
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.core.tween

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        val animationDuration = 500

        composable(
            "home",
            enterTransition = { fadeIn(animationSpec = tween(animationDuration)) },
            exitTransition = { fadeOut(animationSpec = tween(animationDuration)) }
        ) {
            ShoppingListApp()
        }

        composable(
            "profile",
            enterTransition = { fadeIn(animationSpec = tween(animationDuration)) },
            exitTransition = { fadeOut(animationSpec = tween(animationDuration)) }
        ) {
            ProfileScreen()
        }

        composable(
            "settings",
            enterTransition = { fadeIn(animationSpec = tween(animationDuration)) },
            exitTransition = { fadeOut(animationSpec = tween(animationDuration)) }
        ) {
            SettingScreen()
        }
    }
}