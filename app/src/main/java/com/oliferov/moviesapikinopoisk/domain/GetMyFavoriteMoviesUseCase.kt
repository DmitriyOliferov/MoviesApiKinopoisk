package com.oliferov.moviesapikinopoisk.domain

class GetMyFavoriteMoviesUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke() = repository.getMyFavoriteMovies()
}