package com.oliferov.moviesapikinopoisk.data.repository

import android.util.Log
import com.oliferov.moviesapikinopoisk.data.mapper.Mapper
import com.oliferov.moviesapikinopoisk.data.network.ApiFactory
import com.oliferov.moviesapikinopoisk.data.network.ApiService
import com.oliferov.moviesapikinopoisk.domain.Movie
import com.oliferov.moviesapikinopoisk.domain.MovieRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : MovieRepository {

    override fun getAllMovies(): List<Movie> {
        val result = mutableListOf<Movie>()
        val dispose = apiService.getAllMovies()
            .map {
                Log.i("Dxd", it.toString())
                Mapper.mapMovieDtoListToMovieList(it.films)
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    result.addAll(it)
                    Log.i("Dxd", it.toString())
                }, {
                    Log.e("Dxd", "GetMovies: ${it.message.toString()}")
                }
            )
        return result
    }

    override fun getMovie(id: Int): Movie? {
        var result: Movie? = null
        val dispose = ApiFactory.apiService.getMovie(id)
            .map {
                Mapper.mapMovieDtoToMovie(it)
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                result = it
                Log.i("Dxd", it.toString())
            }, {
                Log.i("Dxd", "GetMovie: ${it.message.toString()}")
            })
        return result
    }

    override fun getMyFavoriteMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override fun getMyFavoriteMovie(): Movie {
        TODO("Not yet implemented")
    }
}