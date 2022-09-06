package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class firstChar {
    //    Given an array of non-empty strings, return a Map<String, String> with a key for
//    every different first character seen, with the value of all the strings starting
//    with that character appended together in the order they appear in the array.
//    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//    firstChar([]) → {}
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String res = "";

        for (int i = 0; i < strings.length; i++) {
            res = "";
            res += strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt( 0 ) == strings[j].charAt( 0 )) {
                    res += strings[j];
                }
            }
            if (list.isEmpty()) {
                list.add( res );
                map.put( ""+res.charAt( 0 ),res );
            } else if (!map.containsKey( ""+res.charAt( 0 ) ) ) {
                list.add( res );
                map.put( ""+res.charAt( 0 ),res );
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // String[] strings = {"salt", "tea", "soda", "toast"};
        String[] strings1 = {"aa", "bb", "cc", "aAA", "cCC", "d"};//{"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        System.out.println( firstChar( strings1 ) );
    }
}
