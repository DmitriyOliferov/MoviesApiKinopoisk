package com.oliferov.moviesapikinopoisk.data.network

import com.oliferov.moviesapikinopoisk.data.network.model.MovieDto
import com.oliferov.moviesapikinopoisk.data.network.model.ResponseDto
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.*


interface ApiService {
    @Headers("accept: application/json",
        "X-API-KEY: 39d92274-64d5-4ba1-996e-be09cc2c2815")
    @GET(TOP_FILMS_END_POINT)
    fun getAllMovies(): Observable<ResponseDto>

    @Headers("accept: application/json",
        "X-API-KEY: 39d92274-64d5-4ba1-996e-be09cc2c2815")
    @GET("/api/v2.2/films/{id}")
    fun getMovie(
        @Path("id") id: Int
    ): Single<MovieDto>

    companion object{
        private const val TOP_FILMS_END_POINT = "/api/v2.2/films/top?type=TOP_250_BEST_FILMS&page=1"
        private const val ONE_FILM_END_POINT = "/api/v2.2/films/{id}"
        private const val QUERY_ID_PARAM = "id"

    }

}