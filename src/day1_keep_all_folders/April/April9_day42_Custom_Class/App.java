package day1_keep_all_folders.April.April9_day42_Custom_Class;

public class App {
    String name;
    double version;
    boolean isFree;

    public void run() {
        System.out.println( name + " is running" );
    }

    public void update() {
        System.out.println( name + " is updating" );
        version += 1.1;
    }
}
