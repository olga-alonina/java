package day1_keep_all_folders.May.May31_day64_functional_Interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer[], Integer> contains = (arr, num) -> {
            for (int each : arr) {
                if (each == num) {
                    return true;
                }
            }
            return false;
        };
        BiPredicate<String, String> anagram = (one, two) -> {
            char[] oneArr = one.toCharArray();
            char[] twoArr = two.toCharArray();
            Arrays.sort( oneArr );
            Arrays.sort( twoArr );
            return Arrays.equals( oneArr, twoArr );
        };
        //examples
        Integer[] arr = {23, 25, 2, 5, 2, 5, 2, 5, 2, 5, 2, 5, 7, 5, 2, 2, 1, 4, 5, 5};
        System.out.println( contains.test( arr, 5 ) );
        System.out.println( contains.test( arr, 70 ) );
        System.out.println("anagram "+anagram.test( "silent","listen" ));
    }
}
