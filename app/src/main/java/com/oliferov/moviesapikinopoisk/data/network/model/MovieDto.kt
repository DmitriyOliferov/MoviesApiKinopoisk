package com.oliferov.moviesapikinopoisk.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieDto(
    @Expose
    @SerializedName("kinopoiskId")
    val id: Int,
    @Expose
    val nameRu: String,
    @Expose
    val nameEn: String?,
    @Expose
    val posterUrl: String,
    @Expose
    val rating: Double,

//    @Expose
//    val posterUrlPreview: String,
//    @Expose
//    val ratingGoodReview: Double,
//    @Expose
//    val ratingKinopoisk: Double,
//    @Expose
//    val ratingImdb: Double,
//    @Expose
//    val ratingFilmCritics: Double,
//    @Expose
//    val webUrl: String,

    @Expose
    val year: Int,

//    @Expose
//    val slogan: String,
//    @Expose
//    val description: String,
//    @Expose
//    val shortDescription: String,

    @Expose
    val countries: List<CountryDto>,
    @Expose
    val genres: List<GenresDto>,

)