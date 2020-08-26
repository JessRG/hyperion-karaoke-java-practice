import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private List<String> lyrics;

    // Getter(s) and Setter(s)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }


    // Default Constructor
    public Song() {
        this("default", "default", new ArrayList<>());
    }

    // Constructor
    public Song(String title, String artist, List<String> list) {
        this.title = title;
        this.artist = artist;
        setLyrics(list);
    }

    public static List<String> parseLyrics(String input) {
        String[] lyricList = input.split(" ");

        List<String> parsedLyrics = new ArrayList<>();
        parsedLyrics.addAll(Arrays.asList(lyricList));
        return parsedLyrics;
    }
}
