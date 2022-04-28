package com.oliferov.moviesapikinopoisk.data.mapper

import com.oliferov.moviesapikinopoisk.data.network.model.MovieDto
import com.oliferov.moviesapikinopoisk.domain.Movie
import java.lang.StringBuilder

object Mapper {

    fun mapMovieDtoToMovie(movieDto: MovieDto): Movie {
        val countries = StringBuilder().apply {
            movieDto.countries.map {
                it.country
            }.forEach {
                if (iterator().hasNext()) {
                    this.append("$it, ")
                } else {
                    this.append(it)
                }
            }
        }.toString()

        val genres = StringBuilder().apply {
            movieDto.genres.map {
                it.genre
            }.forEach {
                if (iterator().hasNext()) {
                    this.append("$it, ")
                } else {
                    this.append(it)
                }
            }
        }.toString()

        return Movie(
            id = movieDto.id,
            nameRu = movieDto.nameRu,
            nameEn = movieDto.nameEn.let {
                it
            } ?: "",
            posterUrl = movieDto.posterUrl,
            rating = movieDto.rating,
            year = movieDto.year,
            countries = countries,
            genres = genres
        )

    }

    fun mapMovieDtoListToMovieList(movieDtoList: List<MovieDto>) = movieDtoList.map {
        mapMovieDtoToMovie(it)
    }
}