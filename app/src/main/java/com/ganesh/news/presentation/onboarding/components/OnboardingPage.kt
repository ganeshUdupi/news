package com.ganesh.news.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ganesh.news.R
import com.ganesh.news.presentation.onboarding.Dimensions.MediumPadding1
import com.ganesh.news.presentation.onboarding.Dimensions.MediumPadding2
import com.ganesh.news.presentation.onboarding.Page
import com.ganesh.news.presentation.onboarding.pages
import com.ganesh.news.ui.theme.NewsTheme


@Composable
fun OnBoardingPage(
    modifier: Modifier=Modifier,
    page: Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = page.title,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)) //

        Text(
            text = page.description,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.displayMedium,
            color = colorResource(id = R.color.text_medium)) //
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun OnboardingPagePreview(){
    NewsTheme {
        OnBoardingPage(
            page = pages[0],
            modifier = Modifier
        )
    }
}