package day1_keep_all_folders.homework.homework_April_17;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza sm = new Pizza( 2, 2 );
        sm.setLength( 6 );
        sm.setWidth( 3 );
        sm.setNumber_Of_Toppings( 2 );
        sm.setSize( "medium" );
        System.out.printf( "Your order will be "+ sm.calculatePrice( "Medium", 2 ) );

    }
}

