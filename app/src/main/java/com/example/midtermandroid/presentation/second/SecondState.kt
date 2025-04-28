package com.example.midtermandroid.presentation.second

data class SecondState(
    val games: List<GameUiModel> = emptyList(),
    val isLoading: Boolean = false
)

data class GameUiModel(
    val title: String,
    val description: String,
    val imageResId: Int
)
