package day1_keep_all_folders.April.April_13_day_46_STATIC;

public class BestBuy {

    String location;
    static String headquarters = "Richfield, Minisota, US";
    static String day = "Wednesday";
    static int numbers_Of_Computer = 100;

    public BestBuy(String location) {
        this.location = location;
    }

    public void open_Store() {
        System.out.println( "Openning the " + location );
    }

    public static void reStock() {
        numbers_Of_Computer += 20;
    }
}
