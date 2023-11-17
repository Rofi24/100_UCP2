package com.example.ucp2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    private val _stateUI = MutableStateFlow(CobaViewModel())
    val stateUI: StateFlow<CobaViewModel> = _stateUI.asStateFlow()

    fun setContact(ListData: MutableList<String>){

    }
}