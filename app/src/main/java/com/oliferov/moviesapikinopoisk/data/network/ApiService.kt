package com.oliferov.moviesapikinopoisk.data.network

import com.oliferov.moviesapikinopoisk.data.network.model.MovieDto
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET(TOP_FILMS_END_POINT)
    fun getAllMovies(): Observable<List<MovieDto>>

    @GET(ONE_FILM_END_POINT)
    fun getMovie(
        @Query(QUERY_ID_PARAM) id: Int
    ): Single<MovieDto>

    companion object{
        private const val TOP_FILMS_END_POINT = "/api/v2.2/films/top"
        private const val ONE_FILM_END_POINT = "/api/v2.2/films/"
        private const val QUERY_ID_PARAM = "/api/v2.2/films/"

    }
}