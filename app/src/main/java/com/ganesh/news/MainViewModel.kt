package com.ganesh.news

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ganesh.news.domain.usecases.AppEntryUserCases
import com.ganesh.news.presentation.navgraph.Routes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val appEntryUserCases: AppEntryUserCases) :
    ViewModel() {

    var splashCondition by mutableStateOf(true)
        private set


    var startDestination by mutableStateOf(Routes.AppStartNavigation.routes)
        private set

    init {
        appEntryUserCases.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if (shouldStartFromHomeScreen) {
                startDestination = Routes.NewsNavigation.routes
            } else {
                startDestination = Routes.AppStartNavigation.routes
            }

            splashCondition = false
        }.launchIn(viewModelScope)
    }
}