package com.oliferov.moviesapikinopoisk.data.network.model

import com.google.gson.annotations.Expose

data class ResponseDto(
    @Expose
    val films: List<MovieDto>
)