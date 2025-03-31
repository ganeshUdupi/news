package com.ganesh.news.presentation

sealed class OnBoardingEvent {
    object saveAppEntry: OnBoardingEvent()
}