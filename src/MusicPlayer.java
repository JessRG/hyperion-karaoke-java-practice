import java.io.IOException;
import java.util.List;

public class MusicPlayer extends Player {

    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    // Default Constructor
    public MusicPlayer() {
        this("");
    }

    // Constructor
    public MusicPlayer(String voice) {
        setVoice(voice);
    }

    @Override
    public void play(Song s) {
        Runtime r = Runtime.getRuntime();
        List<String> lyrics = s.getLyrics();

        try {
            r.exec(
                    String.format("Say now playing %s by %s -v %s",
                            s.getTitle(), s.getArtist(), voice));
            Thread.sleep(INTRO_PAUSE);
            for(String lyric : lyrics) {
                r.exec(String.format("Say %s -v %s", lyric, voice));
                Thread.sleep(WORD_CADENCE);
            }
        } catch(IOException | InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void play(Album a) {
        List<Song> songs = a.getSongs();
        for(Song s : songs) {
            play(s);
        }
    }
}
