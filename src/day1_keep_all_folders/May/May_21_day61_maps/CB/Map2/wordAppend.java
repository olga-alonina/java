package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
//    Loop over the given array of strings to build a result string like this:
//    when a string appears the 2nd, 4th, 6th, etc. time in the array, append
//    the string to the result. Return the empty string if no string appears a 2nd time.

    //    wordAppend(["a", "b", "a"]) → "a"
//    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//    wordAppend(["a", "", "a"]) → "a
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String string = "";
        for (String each : strings) {
            if (map.containsKey( each )) {
                int value = map.get( each );
                value++;
                if (value % 2 == 0)
                    string += each;
                map.put( each, value );
            } else
                map.put( each, 1 );
        }
        return string;
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "a", "d", "a"};// "aa"
        String[] str2 = {"a", "b", "b", "b", "a", "c", "a", "a"};// "baa"
        System.out.println( wordAppend( str ) );
        System.out.println( wordAppend( str2 ) );
    }
}

