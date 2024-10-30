package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.Repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.Repository.MovieRepository;
import com.mycompany.dvdstore.Repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {
    private MovieService movieService = new MovieService();
    private MovieRepositoryInterface movieRepository;
    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
    public void addUsingController(){

   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter movie title: ");
    String title = scanner.nextLine();
    System.out.println("Enter movie genre: ");
    String genre = scanner.nextLine();

        //création d'un nouveau film
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        //Ajout du film via movieService
        movieService.add(movie);
        System.out.println("Movie added successfully: "+movie.getTitle()+" ;" +movie.getGenre());
    }
}
