package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService   {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        Collection<Movie> moviesByGenre = movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
        return moviesByGenre;
    }

    public Collection<Movie> findMoviesByLenght(int lenght) {
        Collection<Movie> moviesByGenre = movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= lenght).collect(Collectors.toList());
        return moviesByGenre;
    }
}
