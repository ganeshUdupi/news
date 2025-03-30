package com.ganesh.news.presentation.onboarding

import androidx.annotation.DrawableRes
import com.ganesh.news.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(

  Page(
      title = "Stay Updated",
      description = "Get the latest news from around the world, curated just for you.",
      image = R.drawable.onboarding1 // Replace with actual drawable resource
  ),
    Page(
        title = "Personalized Feeds",
        description = "Follow your favorite topics and get news that matters to you.",
        image = R.drawable.onboarding2 // Replace with actual drawable resource
    ),
    Page(
        title = "Breaking Alerts",
        description = "Receive instant notifications on breaking news and important updates.",
        image = R.drawable.onboarding3 // Replace with actual drawable resource
    )
)
