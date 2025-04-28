package com.example.midtermandroid.presentation.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midtermandroid.domain.usecase.GetGamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val getGamesUseCase: GetGamesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(SecondState())
    val state: StateFlow<SecondState> = _state

    fun handleIntent(intent: SecondIntent) {
        when (intent) {
            is SecondIntent.LoadGames -> loadGames()
        }
    }

    private fun loadGames() {
        viewModelScope.launch {
            val games = getGamesUseCase()
            _state.value = SecondState(
                games = games.map { game ->
                    GameUiModel(
                        title = game.title,
                        description = game.description,
                        imageResId = game.imageResId
                    )
                },
                isLoading = false
            )
        }
    }
}
