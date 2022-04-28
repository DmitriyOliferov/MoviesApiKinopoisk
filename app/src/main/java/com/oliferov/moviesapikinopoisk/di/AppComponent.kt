package com.oliferov.moviesapikinopoisk.di

import com.oliferov.moviesapikinopoisk.MainActivity
import dagger.Component

@Component(
    modules = [DataModule::class]
)
interface AppComponent {

    fun inject(activity: MainActivity)
}