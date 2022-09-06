package day1_keep_all_folders.homework.homework_April_23.Season;

public class CheckSeason {
    public static void main(String[] args) {
        Winter s = new Winter( "Winter", -5, -20 );
        s.activity();
        System.out.println(s);
        Summer w = new Summer( "Summer", 35,15 );
        w.activity();
        System.out.println(w);
        Fall sp = new Fall( "Fall", 5,-5 );
        sp.activity();
        System.out.println(sp);
        Spring fall = new Spring( "Spring", 15,5);
        fall.activity();
        System.out.println(fall);
    }
}
