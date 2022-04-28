package com.oliferov.moviesapikinopoisk.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oliferov.moviesapikinopoisk.domain.GetAllMoviesUseCase
import com.oliferov.moviesapikinopoisk.domain.GetMovieUseCase
import com.oliferov.moviesapikinopoisk.domain.Movie

class MovieViewModel(
    private val getAllMoviesUseCase: GetAllMoviesUseCase,
    private val getMovieUseCase: GetMovieUseCase
): ViewModel() {

    private val _listMovies = MutableLiveData<List<Movie>>()
    val listMovies: LiveData<List<Movie>>
    get() = _listMovies

    fun getAllMovies() {
        _listMovies.value = getAllMoviesUseCase()
    }

    fun getMovie(id: Int): Movie {
        return getMovieUseCase(id) ?: throw RuntimeException("No Movie with id")
    }

}