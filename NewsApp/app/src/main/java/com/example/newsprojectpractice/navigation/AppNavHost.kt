package com.example.newsprojectpractice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsprojectpractice.ui.screens.login.LoginScreen
import com.example.newsprojectpractice.ui.screens.signIn.SignUpScreen
import com.example.newsprojectpractice.ui.fragments.HeadlineFragment



@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SIGN_UP) {
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HeadlineFragment()
        }
        composable(ROUTE_SIGN_UP){
            SignUpScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }


    }
}