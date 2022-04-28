package com.oliferov.moviesapikinopoisk.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oliferov.moviesapikinopoisk.databinding.FragmentMovieListBinding
import com.oliferov.moviesapikinopoisk.databinding.MovieItemBinding
import com.oliferov.moviesapikinopoisk.domain.Movie

class MovieListAdapter: ListAdapter<Movie, MovieViewHolder>(MovieListDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = MovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        with(holder.binding){

        }
    }
}