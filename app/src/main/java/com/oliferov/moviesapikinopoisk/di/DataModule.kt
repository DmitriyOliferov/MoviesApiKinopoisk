package com.oliferov.moviesapikinopoisk.di

import android.text.Editable
import com.oliferov.moviesapikinopoisk.data.network.ApiFactory
import com.oliferov.moviesapikinopoisk.data.network.ApiService
import com.oliferov.moviesapikinopoisk.data.repository.MovieRepositoryImpl
import com.oliferov.moviesapikinopoisk.domain.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindMovieRepository(impl: MovieRepositoryImpl): MovieRepository

    companion object {
        @Provides
        fun provideApiService(): ApiService{
            return ApiFactory.apiService
        }
    }
}