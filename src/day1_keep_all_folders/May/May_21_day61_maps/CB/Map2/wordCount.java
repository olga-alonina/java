package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.*;

public class wordCount {

    //    The classic word-count algorithm: given an array of strings, return a Map<String,
//    Integer> with a key for each different string, with the value the number of times
//    that string appears in the array.
//    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//    wordCount(["c", "c", "c", "c"]) → {"c": 4}
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String>list = new ArrayList<>();
        for (String each : strings) {
            list.add( each );
            Integer count = Collections.frequency( list, each );
            map.put( each,count );
        }
        return map;
    }

}
