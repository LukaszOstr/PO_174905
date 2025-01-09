package zestaw10.Comparable.zad18;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{

    String title;
    String director;
    String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
                title + '\'' +
                ", " + director + '\'' +
                ", " + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.length() - o.title.length();
    }

    public static void main(String[] args) {
        ArrayList<Movie> lista = new ArrayList<>();

        lista.add(new Movie("bad","a","a"));
        lista.add(new Movie("cd","a","a"));
        lista.add(new Movie("d","a","a"));
        lista.add(new Movie("fsss","a","a"));

        Collections.sort(lista);

        System.out.println(lista);


    }

}
