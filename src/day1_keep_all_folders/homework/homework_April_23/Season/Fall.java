package day1_keep_all_folders.homework.homework_April_23.Season;

public class Fall extends season{
    public Fall(String name, int upTemp, int lowTemp) {
        super( name, upTemp, lowTemp );
    } @Override
    public void activity() {
        System.out.println( "Read A Book" );

    }

    @Override
    public String toString() {
        return "Fall{" +
                "name='" + name + '\'' +
                ", upTemp=" + upTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}

