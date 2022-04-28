package com.oliferov.moviesapikinopoisk.domain

class GetMovieUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke(id: Int) = repository.getMovie(id)
}