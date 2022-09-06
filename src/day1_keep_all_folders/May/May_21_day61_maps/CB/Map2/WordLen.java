package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    //    Given an array of strings, return a Map<String, Integer> containing a
//    key for every different string in the array, and the value is that string's length.
//    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
//    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String each : strings) {
            map.put( each, each.length() );
        }
        return map;
    }
}
