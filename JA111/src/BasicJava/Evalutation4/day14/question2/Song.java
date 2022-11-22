package BasicJava.Evalutation4.day14.question2;

import java.util.Objects;

public class Song {
    private String movieName;
    private String songName;

    public Song() {
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName,songName);
    }

    @Override
    public boolean equals(Object o) {
        Song that = (Song) o;
        return this.movieName==that.movieName && this.songName==that.songName;
    }

    public void play(){
        System.out.println(this.songName+" of "+this.movieName+" is playing...!");
    }
}
