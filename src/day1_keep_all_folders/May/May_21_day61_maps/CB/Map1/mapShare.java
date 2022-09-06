package day1_keep_all_folders.May.May_21_day61_maps.CB.Map1;

import java.util.Map;

public class mapShare {
    //    Modify and return the given map as follows: if the key "a" has a value,
//    set the key "b" to have that same value. In all cases remove the key "c",
//    leaving the rest of the map unchanged.
//    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove( "c" );
        if (map.containsKey( "a" )&&!map.get( "a" ).isEmpty()) {
            map.put( "b", map.get( "a" ) );
        }
        return map;
    }

}
