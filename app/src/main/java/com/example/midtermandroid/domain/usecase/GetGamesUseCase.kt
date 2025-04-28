package com.example.midtermandroid.domain.usecase

import com.example.midtermandroid.domain.model.Game
import com.example.midtermandroid.domain.repository.GamesRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(
    private val repository: GamesRepository
) {
    operator fun invoke(): List<Game> {
        return repository.getGames()
    }
}
