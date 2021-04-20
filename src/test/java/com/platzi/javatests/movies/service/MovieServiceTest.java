package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.plaf.multi.MultiViewportUI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    private MovieService movieService;

    @BeforeEach
    void setUp() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Momento", 113, Genre.THRILLER),
                        new Movie(3, "There's something about Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> moviesIds = getMovieIds(movies);
        assertThat(moviesIds, CoreMatchers.is(Arrays.asList(3, 6)));
    }

    @Test
    public void return_movie_by_lenght() {
        Collection<Movie> movies = movieService.findMoviesByLenght(120);
        List<Integer> moviesIds = getMovieIds(movies);
        assertThat(moviesIds, CoreMatchers.is(Arrays.asList(2, 3, 4, 5, 6)));
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
    }
}