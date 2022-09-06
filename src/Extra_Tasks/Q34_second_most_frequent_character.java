package Extra_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q34_second_most_frequent_character {
    public static void main(String[] args) {
       /* 34. Write a Java program to find the second most
       frequent character in a given string. Go to the editor*/
        String str = "aalllddddef";
        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split( "" ) ) );
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency( list, list.get( i ) );
            if (!list2.contains( list.get( i ) )) {
                list2.add( list.get( i ) );
                list2.add( "" + count );
            }
        }
        System.out.println( list2 );//print list with single let +freq. type array string
        int max = Integer.parseInt( list2.get( 1 ) );//declare 1 ind as comparing numbers, i increase by 2
        for (int i = 1; i < list2.size(); i += 2) {
            int number = Integer.parseInt( list2.get( i ) );
            if (number > max) {
                max = number;
            }
        }
        int n = list2.indexOf( String.valueOf( max ) );//finding max numb, remove letter before and num
        list2.remove( n - 1 );
        list2.remove( String.valueOf( max ) );
        System.out.println( list2 );
        int max2 = Integer.parseInt( list2.get( 1 ) );//search for max again
        for (int j = 1; j < list2.size(); j += 2) {
            int number = Integer.parseInt( list2.get( j ) );
            if (number > max2) {
                max2 = number;
            }
        }
        System.out.println( max2 );
        System.out.println( list2.get( list2.indexOf( String.valueOf( max2 ) ) - 1 ) );

    }
}
