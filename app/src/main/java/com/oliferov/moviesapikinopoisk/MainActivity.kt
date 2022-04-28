package com.oliferov.moviesapikinopoisk

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.oliferov.moviesapikinopoisk.data.network.ApiFactory
import com.oliferov.moviesapikinopoisk.data.repository.MovieRepositoryImpl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = MovieRepositoryImpl(ApiFactory.apiService)
        val all = repository.getAllMovies()
        val movie = repository.getMovie(301)
        Log.d("DxdM",movie.toString())
        Log.d("DxdM",all.toString())

    }
}