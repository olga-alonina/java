package day1_keep_all_folders.homework.homework_April_23.Season;

public class season {
    String name;
    int upTemp;
    int lowTemp;

    public season(String name, int upTemp, int lowTemp) {
        this.name = name;
        this.upTemp = upTemp;
        this.lowTemp = lowTemp;
    }

    public void activity() {
    }

    @Override
    public String toString() {
        return "season{" +
                "name='" + name + '\'' +
                ", upTemp=" + upTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}
