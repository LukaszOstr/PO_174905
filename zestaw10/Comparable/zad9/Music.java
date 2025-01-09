package zestaw10.Comparable.zad9;


import java.util.Arrays;


public class Music implements Comparable<Music>{

    String title;
    String artist;
    int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Music{" +
                 title + '\'' +
                ", " + artist + '\'' +
                ", " + releaseYear +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        return o.releaseYear - this.releaseYear;
    }


    public static void main(String[] args) {
        Music[] list = {
                new Music("a","gf",2004),
                new Music("b","djfn",2014),
                new Music("c","sdnks",2008),
                new Music("d","diu",1932)
        };

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));




    }


}
