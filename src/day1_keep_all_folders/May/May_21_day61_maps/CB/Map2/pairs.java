package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    //    Given an array of non-empty strings, create and return a
//    Map<String, String> as follows: for each string add its first character
//    as a key with its last character as the value.
//    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//    pairs(["man", "moon", "main"]) → {"m": "n"}
//    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
       for(String each:strings){
           map.put( ""+each.charAt( 0 ) , ""+each.charAt( each.length()-1 ));
       }
        return map;
    }
}
