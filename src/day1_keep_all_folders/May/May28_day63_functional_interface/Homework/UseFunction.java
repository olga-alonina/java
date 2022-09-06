package day1_keep_all_folders.May.May28_day63_functional_interface.Homework;

import java.util.*;

public class UseFunction {
    public static void main(String[] args) {
        Function<String, Integer> sumOfDigits = (word) -> {
            Integer sum = 0;
            char[] newStr = word.toCharArray();
            for (char each : newStr) {
                if (Character.isDigit( each )) {
                    sum += Integer.parseInt( "" + each );
                } else {
                    continue;

                }
            }
            System.out.println( "sum = " + sum );

        };
        Function<Set<Integer>, List<Integer>> convertingSetToList = set -> {
            List<Integer> list = new ArrayList<>();
            for (Integer each : set) {
                list.add( each );
            }
            System.out.println( "list = " + list );

        };
        Function<String[], String[]> reversedArray = str -> {
            Collections.reverse( Arrays.asList(  str) );
            System.out.println( "reversed array = " +Arrays.toString(  str ));
        };

        //examples
        sumOfDigits.apply( "A123?''dd" );
        Set<Integer> set = new HashSet<>();
        set.addAll( Arrays.asList( 2, 3, 4, 5, 6, 5, 3, 3, 3, 3, 3 ) );
        convertingSetToList.apply( set );
        String[] str = {"Ola","Amma","nana","cookies"};
        reversedArray.apply( str );
    }
}
