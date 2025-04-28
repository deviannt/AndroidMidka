package com.example.midtermandroid.domain.repository

import com.example.midtermandroid.domain.model.Game

interface GamesRepository {
    fun getGames(): List<Game>
}
