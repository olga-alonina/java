package Team_task.interviewPrep.mixApril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class that {
    public static void main(String[] args) {
        String str = "Cat in the hat";
        String str2 = "";
        //swapEx 1 and2      3 and 4
        String[] temp = str.split( " " );
        System.out.println( Arrays.toString( temp ) );
        ArrayList<String> list = new ArrayList<>( Arrays.asList( temp ) );
        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap( list, i, (i + 1) );
        }
        System.out.println( list );
        System.out.println( "***other******" );
        ArrayList<String> words = new ArrayList<>( Arrays.asList( "Cat", "in", "the", "hat" ) );

        for (int i = 0; i < words.size(); i += 2) {

            String temp1 = words.get( i );
            words.set( i, words.get( i + 1 ) ); // storing " In to position i, 0
            words.set( i + 1, temp1 ); // index 1

            //( in, " cat, "in", "the", "hat" it swapEx the indexes
            System.out.println( words );
        }
    }
}
