package com.oliferov.moviesapikinopoisk.domain

class GetAllMoviesUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke() = repository.getAllMovies()
}