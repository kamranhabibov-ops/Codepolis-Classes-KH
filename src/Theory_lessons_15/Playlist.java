package Theory_lessons_15;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private final LinkedList<Song> songs = new LinkedList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean removeByTitle(String title) {
        if (title == null || title.trim().isEmpty()) return false;

        ListIterator<Song> it = songs.listIterator();
        while (it.hasNext()) {
            Song s = it.next();
            if (s.getTitle().equalsIgnoreCase(title.trim())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean moveToTop(String title) {
        if (title == null || title.trim().isEmpty()) return false;

        ListIterator<Song> it = songs.listIterator();
        while (it.hasNext()) {
            Song s = it.next();
            if (s.getTitle().equalsIgnoreCase(title.trim())) {
                it.remove();
                songs.addFirst(s);
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println("\n=== PLAYLIST ===");
        if (songs.isEmpty()) {
            System.out.println("(empty)");
            return;
        }

        int i = 1;
        for (Song s : songs) {
            System.out.println(i + ". " + s);
            i++;
        }
    }
}

