package day1_keep_all_folders.May.May_21_day61_maps.CB.Map2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    /*Given an array of strings, return a Map<String, Boolean> where
     each different string is a key and its value is true if that string appears 2 or more times in the array.
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}*/
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            int frequency = Collections.frequency( Arrays.asList( strings ), strings[i] );
                if (frequency >= 2) {
                    map.put( strings[i], true );
                } else
                    map.put( strings[i], false );
            }
            return map;
        }

    }
