package OH.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lesson {
   public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList( 10, 10, -5, 0, -1, 30, 7, 8, 20, 20, 20 ) );
//sorts
        Collections.sort( numbers );
        //reverse
        Collections.reverse( numbers );
        //max
        Collections.max( numbers );
        //min
        Collections.min( numbers );
        //find 2th, and 3th max number
        numbers.removeIf( each -> Collections.max( numbers ) == each );
        int second_Max = Collections.max( numbers );
        System.out.println( second_Max );
        numbers.removeIf( each -> Collections.max( numbers ) == each );
        int third_Max = Collections.max( numbers );
        System.out.println( third_Max );
        //swapEx
        Collections.swap( numbers, 0, numbers.size() - 1 );
        System.out.println( numbers );
        //Frequency
        Collections.frequency( numbers, 10 );
    }
}
