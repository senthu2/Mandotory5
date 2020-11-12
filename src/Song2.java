import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Song2 implements SongIterator {
    // Create an array of SongInfo Objects
    SongInfo[] bestSongs;

    public Song2() {

        bestSongs = new SongInfo[3];

        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);
        bestSongs[0] = song1;
        bestSongs[1] = song2;
        bestSongs[2] = song3;

    }

    @Override
    public Iterator createIterator() {
        return Arrays.stream(bestSongs).iterator();
    }
}
