public class SongInfo {
   private String songName;
   private String songBand;
   private int yearReleased;

    public SongInfo(String songName, String songBand, int yearReleased) {
        this.songName = songName;
        this.songBand = songBand;
        this.yearReleased = yearReleased;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongBand() {
        return songBand;
    }

    public void setSongBand(String songBand) {
        this.songBand = songBand;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "SongName: " + songName + " Band: " + songBand + " YearReleased: " + yearReleased;
    }
}
