package com.oliferov.moviesapikinopoisk.domain

class GetMovieUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke() = repository.getMovie()
}