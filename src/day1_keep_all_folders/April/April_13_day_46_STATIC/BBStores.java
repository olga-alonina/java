package day1_keep_all_folders.April.April_13_day_46_STATIC;

public class BBStores {
    public static void main(String[] args) {
        System.out.println( BestBuy.headquarters );
        System.out.println( BestBuy.day );
        System.out.println( BestBuy.numbers_Of_Computer );
        System.out.println( "*******Oak Park******" );
        BestBuy store1 = new BestBuy( "Oak Park" );
        System.out.println( store1.location );
        System.out.println( store1.numbers_Of_Computer );
        store1.numbers_Of_Computer--;
        System.out.println( BestBuy.numbers_Of_Computer );
        System.out.println( "*******Main St******" );
        BestBuy store2 = new BestBuy( "Main St" );
        store2.numbers_Of_Computer -= 5;
        System.out.println( store1.numbers_Of_Computer );
        System.out.println( BestBuy.numbers_Of_Computer );
        store2.location = "Fairfax";
        System.out.println( store1.location );
        System.out.println( store2.location );
        BestBuy.reStock();
        System.out.println( BestBuy.numbers_Of_Computer );
        store1.reStock();
        System.out.println( BestBuy.numbers_Of_Computer );

        // BestBuy.openStore()

        store1.open_Store();
        store2.open_Store();
    }
}
