package com.example.midtermandroid.data.repository

import com.example.midtermandroid.R
import com.example.midtermandroid.domain.model.Game
import com.example.midtermandroid.domain.repository.GamesRepository
import javax.inject.Inject

class GamesRepositoryImpl @Inject constructor() : GamesRepository {
    override fun getGames(): List<Game> {
        return listOf(
            Game(
                title = "Counter-Strike 2",
                description = "Тактический шутер, где команды соревнуются в выполнении задач. Улучшенная физика, графика и механики по сравнению с CS:GO.",
                imageResId = R.drawable.cs2_image
            ),
            Game(
                title = "Dota 2",
                description = "Популярная MOBA-игра, в которой две команды по 5 человек сражаются на карте, используя уникальных героев с особыми способностями.",
                imageResId = R.drawable.dota2_image
            )
        )
    }
}
