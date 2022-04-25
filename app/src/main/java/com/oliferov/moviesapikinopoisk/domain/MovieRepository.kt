package com.oliferov.moviesapikinopoisk.domain

interface MovieRepository {
    fun getAllMovies(): List<Movie>

    fun getMovie(): Movie

    fun getMyFavoriteMovies(): List<Movie>

    fun getMyFavoriteMovie(): Movie

}