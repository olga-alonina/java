package day1_keep_all_folders.April.April9_day42_Custom_Class;

public class usingCoffee {
    public static void main(String[] args) {
        Coffee brand1 = new Coffee();
        brand1.brand = "Starbucks";
        brand1.price = 4.99;
        brand1.size = 16;
        brand1.type = "Black";
        System.out.println("********");
        System.out.println( brand1 );
        brand1.drink();
        brand1.refill( 32 );
        brand1.drink();
        brand1.drink();
        brand1.drink();
        System.out.println(brand1);
    }

}
