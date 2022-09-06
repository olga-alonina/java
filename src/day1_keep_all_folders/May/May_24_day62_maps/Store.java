package day1_keep_all_folders.May.May_24_day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put( "Milk", 2.99 );
        store.put( "Juice", 2.55 );
        store.put( "Apple", 1.40 );
        store.put( "Bread", 1.00 );
        store.put( "Cucumber", 1.59 );
        System.out.println( "Store inventory" );

        for (Map.Entry<String, Double> each : store.entrySet()) {
            System.out.println( "\tItem: " + each.getKey() + " for $ " + each.getValue() );

        }
        System.out.println( store.values() );
        Scanner input = new Scanner( System.in );
        System.out.println( "What item do you want?" );
        String item = input.nextLine();
        System.out.println( (store.containsKey( item )
                ? item + " is in stock with price 09" + store.get( item ) : "Not available in this store") );


    }
}
