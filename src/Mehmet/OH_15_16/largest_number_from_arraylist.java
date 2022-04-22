package Mehmet.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largest_number_from_arraylist {
      public static int largest_Number_Of_Arraylist(ArrayList<Integer> list, int givenMax) {
        System.out.println( "return the " + givenMax + "th largest number from an arraylist" );
        for (int i = 1; i < givenMax; i++) {
            Integer temp = Collections.max( list );
            list.removeAll( Arrays.asList( temp ) ); // will remove the duplicates if we have.
        }
        Integer max = Collections.max( list );
        return (max);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 7, 8, 8 ) );
        System.out.println( "with collection metods= " + largest_Number_Of_Arraylist( list, 5 ) );
    }
}
