package com.example.midtermandroid.presentation.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    val title = "Online Games"
    val buttonText = "Перейти ко второму экрану"
}
