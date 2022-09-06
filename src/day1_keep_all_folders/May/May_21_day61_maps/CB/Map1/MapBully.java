package day1_keep_all_folders.May.May_21_day61_maps.CB.Map1;

import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
//        Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
//
//
//                mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"
        if (map.containsKey( "a" )) {
            if (map.get( "a" ).isEmpty()) {

            } else {
                map.put( "b", map.get( "a" ) );
                map.put( "a", "" );
            }}
            return map;
        }
    }
