import java.util.ArrayList;
import java.util.Iterator;

public class Song1 implements SongIterator {
    // ArrayList holds SongInfo objects
    ArrayList<SongInfo> bestSongs = new ArrayList<SongInfo>();

    public Song1() {
        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);
        bestSongs.add(song1);
        bestSongs.add(song2);
        bestSongs.add(song3);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
