package com.raywenderlich.listmaker.ui.main

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.raywenderlich.listmaker.databinding.MainFragmentBinding

class MainViewModelFactory(private val sharedPreferences: SharedPreferences): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras):
            T {
        return MainViewModel(sharedPreferences) as T
    }
}