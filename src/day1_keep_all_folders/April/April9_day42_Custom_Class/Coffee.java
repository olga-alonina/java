package day1_keep_all_folders.April.April9_day42_Custom_Class;

public class Coffee {
    String brand;
    double price;
    double size;
    String type;

    @Override
    public String toString() {
        return type + " from " + brand +
                "with price " + price +
                ", on size " + size;
    }

    public void drink() {
        System.out.println( "Drinking " + type );
        size-=1.5;
    }

    public void refill(double amount) {
        size += amount;
        System.out.println( "Refilling " + amount + " oz" +
                " size of coffee become " + size );
    }
}
