package day1_keep_all_folders.May.May28_day63_functional_interface.Homework;


import java.util.Arrays;
import java.util.Collections;

public class UseListFunction {
    public static void main(String[] args) {
        ListFunction<Integer, Integer> maximum_number = (num) -> {
            Integer max = Collections.max( num );
            System.out.println( "max = " + max );
        };

        ListFunction<Integer, Integer> minimum_number = (num) -> {
            Integer min = Collections.min( num );
            System.out.println( "min = " + min );
        };
        ListFunction<String, String> longest_String = (word) -> {
            String longest = word.get( 0 );
            for (String each : word) {
                if (each.length() > longest.length()) {
                    longest = each;

                }
            }
            System.out.println( "longest word = " + longest );

        };
        ListFunction<String, String> shortest_String = (word) -> {
            String shortest = word.get( 0 );
            for (String each : word) {
                if (each.length() < shortest.length()) {
                    shortest = each;

                }
            }
            System.out.println( "shortest word = " + shortest );
        };
        ListFunction<Integer, int[]> convert_To_array = (list) -> {
         int [] newArray = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                newArray[i] = list.get(i);
            }
            System.out.println( "Array = " + Arrays.toString(newArray) );
        };
        //examples:
        minimum_number.apply( Arrays.asList( 56, 65, 22, 33, 33 ) );
        maximum_number.apply( Arrays.asList( 56, 65, 22, 33, 33 ) );
        longest_String.apply( Arrays.asList( "Ola", "Anna", "watermelon" ) );
        shortest_String.apply( Arrays.asList( "Ola", "Anna", "watermelon" ) );
        convert_To_array.apply( Arrays.asList( 2,3,3,2,3,5,2,6,3 ) );
    }
}



