package zestaw9;

import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum{

    String RockGenre;

    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.RockGenre = rockGenre;
    }

    public String getRockGenre() {
        return RockGenre;
    }

    public void setRockGenre(String rockGenre) {
        RockGenre = rockGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RockAlbum rockAlbum = (RockAlbum) o;
        return Objects.equals(getRockGenre(), rockAlbum.getRockGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRockGenre());
    }

    @Override
    public String toString() {
        return "RockAlbum{" +
                "RockGenre='" + RockGenre + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
