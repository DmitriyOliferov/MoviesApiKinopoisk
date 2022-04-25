package com.oliferov.moviesapikinopoisk.domain

class GetMyFavoriteMovieUseCase (
    private val repository: MovieRepository
) {
    operator fun invoke() = repository.getMyFavoriteMovie()
}