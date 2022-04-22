package day1_keep_all_folders.April.April_10_day_43;

public class UseCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet( true, 8.5, 12, 2.5 );
        System.out.println( carpet1 );
        carpet1.length=14;
        carpet1.calculatePrice();
        System.out.println("total price will be " +carpet1.totalPrice );
    }
}
