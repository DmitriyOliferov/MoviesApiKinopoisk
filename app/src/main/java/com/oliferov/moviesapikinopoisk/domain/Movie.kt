package com.oliferov.moviesapikinopoisk.domain

import com.oliferov.moviesapikinopoisk.data.network.model.CountryDto
import com.oliferov.moviesapikinopoisk.data.network.model.GenresDto

data class Movie(
    val id: Int,
    val nameRu: String,
    val nameEn: String,
    val posterUrl: String,
    val rating: Double,

//
//    val posterUrlPreview: String,
//
//    val ratingGoodReview: Double,
//
//    val ratingKinopoisk: Double,
//
//    val ratingImdb: Double,
//
//    val ratingFilmCritics: Double,
//
//    val webUrl: String,

    val year: Int,

//
//    val slogan: String,
//
//    val description: String,
//
//    val shortDescription: String,

    val countries: String,
    val genres: String,

    )