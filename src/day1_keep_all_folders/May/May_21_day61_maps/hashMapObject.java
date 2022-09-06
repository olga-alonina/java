package day1_keep_all_folders.May.May_21_day61_maps;

import java.util.HashMap;
import java.util.Map;

public class hashMapObject {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();
        map.put( 1,"one" );
        map.put( 16,"sixteen" );
        map.put( 10,"ten" );
        map.put( 5,"five" );
        System.out.println(map);
        System.out.println( "read the key/value from map" );
        System.out.println(map.get( 10 ));
        String value = map.get( 5 );
        System.out.println("removing");
        map.remove( 1 );
        System.out.println(map);
        System.out.println("contain");
        System.out.println(map.containsKey( 1 ));
        System.out.println(map.containsKey( 3 ));
        System.out.println(map.containsValue( "five" ));
        System.out.println(map.containsValue( "10" ));//do not have String "10"
        map.put( 7,"five" );
        System.out.println(map);



    }
}
