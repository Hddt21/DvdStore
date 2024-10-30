package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.Repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.Repository.MovieRepository;
import com.mycompany.dvdstore.Repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.entity.Movie;

public class MovieService {
    private static Long LastTitle = 0L;
    private MovieRepository movieRepository = new MovieRepository();
    private MovieRepositoryInterface movieRepositoryInterface; 
    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
    public void add(Movie movie){
        goLiveMovieRepository.add(movie);
    }

}
