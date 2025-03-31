package com.ganesh.news.domain.usecases

import com.ganesh.news.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(private val localUserManager: LocalUserManager) {
        operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}