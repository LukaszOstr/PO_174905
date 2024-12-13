package zestaw9;

import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    String title;
    String artist;
    ArrayList<Double> ratings;

    public MusicAlbum(String title, String artist, ArrayList<Double> ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = ratings;
    }



    public void addRating(double rating){
        this.ratings.add(rating);
    }

    public void deleteRating(int index){
        this.ratings.remove(index);
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }
}
