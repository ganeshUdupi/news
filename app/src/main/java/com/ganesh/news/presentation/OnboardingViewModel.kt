package com.ganesh.news.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ganesh.news.domain.usecases.AppEntryUserCases
import com.ganesh.news.presentation.OnBoardingEvent.saveAppEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(private val appEntryUserCases: AppEntryUserCases) : ViewModel() {

    fun onEvent(event: OnBoardingEvent){
        when(event){
            is saveAppEntry -> {
                saveAppEntry()
            }
        }
    }

    private fun saveAppEntry() {
        viewModelScope.launch {
            appEntryUserCases.saveAppEntry()
        }
    }
}