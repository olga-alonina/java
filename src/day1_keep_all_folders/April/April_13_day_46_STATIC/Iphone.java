package day1_keep_all_folders.April.April_13_day_46_STATIC;

public class Iphone {
    String model;
    double price;
    static String company;
    static String os;
    static boolean appleDay;
    static String day;

    static {
        System.out.println("Static run");
        company = "Apple";
        os="IOS";
        day = "Wednesday";
        if(day.equals( "Friday" )){
            appleDay=true;
        }
    }

    public Iphone(String model, double price) {
        System.out.println("Constructor run");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
