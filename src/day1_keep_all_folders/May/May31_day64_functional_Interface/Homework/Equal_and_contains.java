package day1_keep_all_folders.May.May31_day64_functional_Interface.Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Equal_and_contains {
    public static void main(String[] args) {
        BiPredicate<Integer[], Integer[]> equal_and_contains = (one, two) -> {
            Arrays.sort( one );
            Arrays.sort( two );
            if (Arrays.equals( one, two )) {
                return true;
            }
            return false;
        };
        BiPredicate<Integer[], Integer[]> one_contains_another = (one, two) -> {
            int count = 0;
            for (Integer integer : one) {
                for (Integer value : two) {
                    if (integer.equals( value )) {
                        count++;
                    }
                }
                if (count == two.length) {
                    return true;
                }
            }
            return false;
        };
        BiFunction<String, String, String> common_Character = (one, two) -> {
            String common = "";
            for (int j = 0; j < two.length() - 1; j++) {
                if (one.contains( two.charAt( j ) + "" + two.charAt( j + 1 ) )) {
                    common += two.charAt( j ) + "" + two.charAt( j + 1 ) + " ";
                }

            }
            return common;
        };
        BiFunction<Integer[], Integer[], Map<Integer, Integer>> common_Digits = (one, two) -> {
            Map<Integer, Integer> map = new HashMap<>();
            Integer[] news = new Integer[one.length + two.length];
            for (int i = 0; i < one.length; i++) {
                news[i] = one[i];
            }
            for (int k = one.length, j = 0; k < news.length; k++, j++) {
                news[k] = two[j];
            }
            for (int z = 0; z < news.length; z++) {
                Integer common = Collections.frequency( Arrays.asList( news ), news[z] );
                map.put( news[z], common );

            }
            return map;
        };

        //examples
        Integer[] arr1 = {3, 2, 1, 4, 4, 4, 5};
        Integer[] arr2 = {2, 1, 3};
        System.out.println( "equal_and_contains =>  " + equal_and_contains.test( arr1, arr2 ) );
        System.out.println( "one_contains_another =>" + one_contains_another.test( arr1, arr2 ) );
        String str1 = "Pyorthon";
        String str2 = "Wooorden Spoon";
        System.out.println( "common character =>" + common_Character.apply( str2, str1 ) );
        Integer[] arr4 = {2, 3, 2, 5, 2, 1, 2, 5, 2, 5, 2};
        Integer[] arr3 = {5, 4, 5, 6, 9, 5, 8, 5, 4, 5, 4, 5};
        System.out.println( "common digits =>" + common_Digits.apply( arr3, arr4 ) );

    }
}
