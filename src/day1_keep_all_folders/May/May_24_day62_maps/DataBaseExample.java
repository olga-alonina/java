package day1_keep_all_folders.May.May_24_day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static Map<String, String> makeMap(String... values) {
        Map<String, String> map = new HashMap<>();
        map.put( "First_Name", values[0] );
        map.put( "Last_Name", values[1] );
        map.put( "Batch", values[2] );
        return map;
    }

    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        list.add( makeMap( "Olga", "Alonina", "26" ) );
        list.add( makeMap( "Alex", "Zayarny", "6" ) );
        list.add( makeMap( "Oleg", "Nazarov", "15" ) );
        list.add( makeMap( "Stas", "Kipelov", "1" ) );
        list.add( makeMap( "Anna", "Taly", "22" ) );
        System.out.println( list.get( 0 ).get( "First_Name" ) );
        System.out.println( list.get( 0 ).get( "Last_Name" ) );

        for (Map<String, String> each : list) {
            System.out.println( each );
        }
        for (Map<String, String> each : list) {
            System.out.println("\"First_Name\""+ each.get( "First_Name" ) );
        }
        System.out.println("***************************************");
        for (Map<String, String> each : list) {
          if(Integer.parseInt( each.get( "Batch" ))>=20 ){
              System.out.println("First_Name batch>=20 "+ each.get( "First_Name" ));
          }
        }

    }
}
