package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "what is the movie name ?!" );
        //Scanner sc = new Scanner(System.in);
        //String title = sc.nextLine();
        //Movie movie = new Movie();
        //movie.setTitle(title);
        MovieController movieController = new MovieController();
        movieController.addUsingController();

    }
}
