package com.oliferov.moviesapikinopoisk.di

import com.oliferov.moviesapikinopoisk.presentation.ui.MainActivity
import dagger.Component

@Component(
    modules = [DataModule::class]
)
interface AppComponent {

    fun inject(activity: MainActivity)
}