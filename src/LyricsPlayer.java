import java.io.IOException;
import java.util.List;

import static java.lang.Thread.sleep;

public class LyricsPlayer extends Player {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    private String textColor = "default";

    // Default Constructor
    public LyricsPlayer() {}

    // Constructor
    public LyricsPlayer(String textColor) {
        this.textColor = textColor;
    }

    // Getter(s) and setter(s)
    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    // displayText method
    private void displayText(String string) {
        String colorCode = RESET;
        switch(textColor.toLowerCase()) {
            case "red":
                colorCode = RED;
                break;
            case "green":
                colorCode = GREEN;
                break;
            case "yellow":
                colorCode = YELLOW;
                break;
            case "blue":
                colorCode = BLUE;
                break;
            case "purple":
                colorCode = PURPLE;
                break;
            case "cyan":
                colorCode = CYAN;
                break;
        }
        System.out.printf("%s%s", colorCode, string);
    }

    @Override
    public void play(Song s) {
        Runtime r = Runtime.getRuntime();
        List<String> lyrics = s.getLyrics();

        try {
            System.out.printf("\n%sNow playing... %s by %s\n", RESET, s.getTitle(), s.getArtist());
            sleep(INTRO_PAUSE);
            for(String lyric : lyrics) {
                displayText(lyric);
                System.out.print(" ");
                sleep(WORD_CADENCE);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println();
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
