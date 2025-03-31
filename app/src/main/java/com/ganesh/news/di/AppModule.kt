package com.ganesh.news.di

import android.app.Application
import com.ganesh.news.data.manager.LocalUserManagerImpl
import com.ganesh.news.domain.manager.LocalUserManager
import com.ganesh.news.domain.usecases.AppEntryUserCases
import com.ganesh.news.domain.usecases.ReadAppEntry
import com.ganesh.news.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun providesAppEntryUseCases(localUserManager: LocalUserManager) = AppEntryUserCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}