import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private List<String> lyrics;

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
        setTitle("Default");
        setArtist("Default");
        lyrics = new ArrayList<>();
    }

    // Constructor
    public Song(String title, String artist, List<String> list) {
        setTitle(title);
        setArtist(artist);
        setLyrics(list);
    }

    public static List<String> parseLyrics(String input) {
        String[] list = input.split(" ");
        List<String> parsedLyrics = new ArrayList<>();
        for (String lyric : list) {
            parsedLyrics.add(lyric);
        }
        return parsedLyrics;
    }
}
