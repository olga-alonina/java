package day1_keep_all_folders.homework.homework_April_23.Season;

public class Spring extends season {
    public Spring(String name, int upTemp, int lowTemp) {
        super( name, upTemp, lowTemp );
    }

    @Override
    public void activity() {
        System.out.println( "Go Outside" );

    }

    @Override
    public String toString() {
        return "Spring{" +
                "name='" + name + '\'' +
                ", upTemp=" + upTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}

