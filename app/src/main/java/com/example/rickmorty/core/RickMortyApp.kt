package com.example.rickmorty.core

import android.app.Application
import androidx.lifecycle.ViewModel

class RickMortyApp: Application() {

    lateinit var viewModel: ViewModel

    override fun onCreate() {
        super.onCreate()
    }
}