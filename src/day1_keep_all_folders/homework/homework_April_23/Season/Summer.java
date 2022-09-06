package day1_keep_all_folders.homework.homework_April_23.Season;

public class Summer extends season {
    public Summer(String name, int upTemp, int lowTemp) {
        super( name, upTemp, lowTemp );
    }

    @Override
    public void activity() {
        System.out.println( "Drink Lemonade" );

    }

    @Override
    public String toString() {
        return "Summer{" +
                "name='" + name + '\'' +
                ", upTemp=" + upTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}
