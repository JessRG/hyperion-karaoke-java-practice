import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

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

    public Album() {
        this("defaultAlbum", new ArrayList<>());
    }

    // Constructor
    public Album(String name, List<Song> songs) {
        setName(name);
        setSongs(songs);
    }

    public void printTrackListings() {
        List<Song> tracks = getSongs();
        System.out.println("90S HITS track listing...");
        for (int i = 0; i < tracks.size(); i++) {
            System.out.println(
                    String.format("%d. %s by %s", i + 1, tracks.get(i).getTitle(), tracks.get(i).getArtist())
            );
        }
    }
}
