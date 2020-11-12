import java.util.Iterator;

public class Handler {
    //Iterators for Song
    SongIterator song1;
    SongIterator song2;
    SongIterator song3;

    //Initalisere iterator
    public Handler(SongIterator song1, SongIterator song2,SongIterator song3) {
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }

    //Metode for at printe ud
    public void show(){
        System.out.println("New way with Iterator");

        System.out.println("THIS IS SONG1");
        Iterator Song1 = song1.createIterator();
        print(Song1);
        System.out.println();

        System.out.println("THIS IS SONG2");
        Iterator Song2 = song2.createIterator();
        print(Song2);
        System.out.println();

        System.out.println("THIS IS SONG3");
        Iterator Song3 = song3.createIterator();
        print(Song3);
        System.out.println();


    }
    public void print(Iterator iterator){
        while (iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getSongBand());
            System.out.println(songInfo.getYearReleased());
        }

    }
}
