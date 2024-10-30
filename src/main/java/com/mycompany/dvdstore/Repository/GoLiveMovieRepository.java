package com.mycompany.dvdstore.Repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GoLiveMovieRepository implements MovieRepositoryInterface {
    private static List<Movie> movies = new ArrayList<Movie>();
    public void add(Movie movie) {
        try {
            // 'true' pour ajouter au fichier existant
            FileWriter writer = new FileWriter("C:\\Users\\win\\IdeaProjects\\Movie\\movie.txt", true);
            // Formate le film en "titre;genre"
            writer.write(movie.getTitle() + "; " + movie.getGenre() + "\n");
            writer.close();
            System.out.println("Le film " + movie.getTitle() + " a été ajouté avec succès dans le fichier.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
