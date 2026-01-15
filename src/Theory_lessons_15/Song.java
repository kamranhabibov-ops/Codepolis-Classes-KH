package Theory_lessons_15;

public class Song {
    private String title;
    private String artist;
    private int duration; // seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + "s)";
    }
}
