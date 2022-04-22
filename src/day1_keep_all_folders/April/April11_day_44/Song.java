package day1_keep_all_folders.April.April11_day_44;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song(String name) {
        this.name = name;
    }

    public Song(String name, double length) {
        this( name );
        this.length = length;
    }

    public Song(String name, double length, String artist) {
        this( name, length );
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
        this( name, length, artist );
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
