package com.ganesh.news.presentation.navgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.ganesh.news.presentation.OnboardingViewModel
import com.ganesh.news.presentation.onboarding.OnboardingScreen
import okhttp3.Route

@Composable
fun NavGraph(
    startDestination: String
) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        navigation(
            route = Routes.AppStartNavigation.routes,
            startDestination = Routes.OnBoardingScreen.routes
        ) {
            composable(
                route = Routes.OnBoardingScreen.routes

            ) {
                val viewModel : OnboardingViewModel = hiltViewModel()
                OnboardingScreen(
                    event = {
                        viewModel.onEvent(it)
                    }
                )

            }

        }

        navigation(route = Routes.NewsNavigation.routes,
            startDestination = Routes.NewsNavigatorScreen.routes){

            composable(route = Routes.NewsNavigatorScreen.routes) {

                Text(text = "News Navigator Screen")
            }
        }
    }


}