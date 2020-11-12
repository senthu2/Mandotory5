import java.security.Signature;
import java.util.*;

public class Main{
    ArrayList<SongInfo> ALSongInfo = new ArrayList<>();
    SongInfo[] ASongInfo = new SongInfo[3];
    Hashtable<Integer, SongInfo> HTSongInfo = new Hashtable<>();


    public static void main(String[] args) {
        System.out.println("hej");
        //ExampleAL(ALSongInfo);
        //ExampleA(ASongInfo);
        //ExampleHT(HTSongInfo);

        Song1 song1 = new Song1();
        Song2 song2 = new Song2();
        Song3 song3 = new Song3();
        Handler handler = new Handler(song1,song2,song3);
        handler.show();

    }

    public static void ExampleAL(ArrayList<SongInfo> ALSongInfo) {
        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);
        ALSongInfo.add(song1);
        ALSongInfo.add(song2);
        ALSongInfo.add(song3);

       /* Iterator<SongInfo> it = ALSongInfo.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        for (int i = 0; i < ALSongInfo.size(); i++) {
            System.out.println(i + 1 + ". " + ALSongInfo.get(i).toString());
        }
    }

    public static void ExampleA(SongInfo[] ASongInfo) {
        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);
        ASongInfo[0] = song1;
        ASongInfo[1] = song2;
        ASongInfo[2] = song3;




        for (int i = 0; i < ASongInfo.length; i++) {
            System.out.println(Arrays.toString(ASongInfo));
        }

    }

    public static void ExampleHT(Hashtable<Integer, SongInfo> HTSongInfo) {

        SongInfo song1 = new SongInfo("Imagine", "John Lennon", 1971);
        SongInfo song2 = new SongInfo("American Pie", "Don McLean", 1971);
        SongInfo song3 = new SongInfo("Beat it", "Micheal Jackson", 1979);

        HTSongInfo.put(1, song1);
        HTSongInfo.put(2, song2);
        HTSongInfo.put(3, song3);

        Enumeration<Integer> enumeration = HTSongInfo.keys();
        // iterate using enumeration object
        while (enumeration.hasMoreElements()) {
            Integer key = enumeration.nextElement(); //Så det ikke bliver infinite loop
            System.out.println(HTSongInfo);

        }
    }

}
