package day1_keep_all_folders.May.May_21_day61_maps.CB.Map1;

import java.util.Map;

public class mapAB2 {

    //    Modify and return the given map as follows: if the keys "a"
//    and "b" are both in the map and have equal values, remove them both.
//            mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey( "a" ) && map.containsKey( "b" )) {
            if (map.get( "a" ).equals( map.get( "b" ) )) {
                map.remove( "a" );
                map.remove( "b" );
            }
        }
        return map;
    }
}
