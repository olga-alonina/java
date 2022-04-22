package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Using_Collection_Class {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList( 16, 45, 69, 15, 15, 14, 16 ) );
        Collections.sort( list );
        System.out.println( "list = " + list );
        System.out.println( "Reverse" );
        Collections.reverse( list );
        System.out.println( "reverse list = " + list );
        System.out.println( "Characters" );
        ArrayList<Character> letters = new ArrayList<>( Arrays.asList( 'A', 'B', 'C', 'D' ) );
        Collections.reverse( letters );
        System.out.println( "reverse letters = " + letters );
        System.out.println( "Max and min value" );
        System.out.println( "Max " + Collections.max( list ) );
        System.out.println( "Min " + Collections.min( list ) );
        System.out.println( "Swap" );
        Collections.swap( letters, 0, 3 );
        System.out.println( "swap letters = " + letters );
        System.out.println( "Frequency with numbers" );
        System.out.println("Frequency "+ Collections.frequency( list, 15 ) );
        System.out.println("Frequency with words");
        ArrayList<String> words = new ArrayList<>( Arrays.asList( "one", "two", "one", "one", "one", "three" ) );
        System.out.println("Frequency "+ Collections.frequency( words, "one" ) );
    }
}
