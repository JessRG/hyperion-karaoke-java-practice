import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    // Getter(s) and Setter(s)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    // Default Constructor
    public Album() {
        this("defaultAlbum", new ArrayList<>());
    }

    // Constructor
    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void printTrackListings() {
        List<Song> tracks = getSongs();
        System.out.println(String.format("%s track listing...", name));
        for (int i = 0; i < tracks.size(); i++) {
            System.out.printf("%d. %s by %s\n", i + 1, tracks.get(i).getTitle(), tracks.get(i).getArtist());
        }
    }
}
