package com.ganesh.news.presentation.navgraph

sealed class Routes(
    val routes: String
) {
    object OnBoardingScreen : Routes(routes = "onBoardingScreen")
    object HomeScreen: Routes(routes = "HomeScreen")
    object SearchScreen : Routes(routes = "SearchScreen")
    object BookMarkScreen : Routes(routes = "BookMarkScreen")
    object DetailsScreen : Routes(routes = "DetailsScreen")
    object AppStartNavigation: Routes(routes = "appStartNavigation")
    object NewsNavigation: Routes(routes = "newsNavigation")
    object NewsNavigatorScreen: Routes(routes = "newsNavigator")

}