package day1_keep_all_folders.homework.homework_April_23.Season;

public class Winter extends season {
    public Winter(String name, int upTemp, int lowTemp) {
        super( name, upTemp, lowTemp );
    }

    @Override
    public void activity() {
        System.out.println( "Use Fireplace" );

    }

    @Override
    public String toString() {
        return "Winter{" +
                "name='" + name + '\'' +
                ", upTemp=" + upTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}
