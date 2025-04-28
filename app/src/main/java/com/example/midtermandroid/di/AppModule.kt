package com.example.midtermandroid.di

import com.example.midtermandroid.data.repository.GamesRepositoryImpl
import com.example.midtermandroid.domain.repository.GamesRepository
import com.example.midtermandroid.domain.usecase.GetGamesUseCase
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
    fun provideGamesRepository(): GamesRepository {
        return GamesRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideGetGamesUseCase(repository: GamesRepository): GetGamesUseCase {
        return GetGamesUseCase(repository)
    }
}
