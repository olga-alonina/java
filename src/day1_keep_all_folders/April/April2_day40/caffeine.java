package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add( "coffee" );
        drinks.add( "tea" );
        drinks.add( "energy usingCoffee" );
        drinks.add( "soda" );
        System.out.println( drinks );
        System.out.println( "****************" );

        ArrayList<String> drinks2 = new ArrayList<>( drinks );
        System.out.println( drinks2 );
        System.out.println( "****************" );

        String[] allDrinks = {"coffee", "tea", "energy usingCoffee", "soda"};
        ArrayList<String> drinks3 = new ArrayList<>( Arrays.asList( allDrinks ) );
        System.out.println( drinks3 );
        System.out.println( "****************" );

        ArrayList<String> drinks4 = new ArrayList<>( Arrays.asList( "coffee", "tea", "energy usingCoffee", "soda" ) );
        System.out.println( "drinks4 = " + drinks4 );
    }
}
