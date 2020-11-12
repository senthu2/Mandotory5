import java.util.Hashtable;
import java.util.Iterator;

public class Song3 implements SongIterator {
    // Create a Hashtable with an int as a key and SongInfo
    // Objects
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    public Song3() {

        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);

        bestSongs.put(1, song1);
        bestSongs.put(2, song2);
        bestSongs.put(3, song3);

    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
