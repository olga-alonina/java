package day1_keep_all_folders.homework.VesaPackJune9;

import java.util.*;

public class Sort_map_values {
    //1) Map - Sort the map by values
//Write a method that can sort the Map by values
    public static void sort_map_values(HashMap<String, Integer> map1) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>( map1.entrySet() );
        list.sort( Map.Entry.comparingByValue() );
        System.out.println( "list = " + list );
    }

    //    2) Map - Frequency of Characters
//    Write a method that prints the frequency of each character from a String
    public static void frequency_of_Characters(HashMap<String, Integer> map1) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>( map1.entrySet() );
        String[] words = map1.keySet().toArray( new String[0] );
        for (String eachWords : words) {
            String[] letters = eachWords.split( "" );
            TreeMap<String, Integer> temp = new TreeMap<>();
            int count = 0;
            for (String letter : letters) {
                count = Collections.frequency( List.of( letters ), letter );
                temp.put( letter, count );
            }
            System.out.println( temp );
        }

    }

    public static void unique_character_from_String(HashMap<String, Integer> map1) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>( map1.entrySet() );
        TreeMap<String, Integer> temp = new TreeMap<>();
        String[] words = map1.keySet().toArray( new String[0] );
        for (String eachWords : words) {
            String[] letters = eachWords.split( "" );

            int count = 0;
            for (String letter : letters) {
                count = Collections.frequency( List.of( letters ), letter );
                if (count == 1) {
                    temp.put( letter, count );
                }
            }
        }
        System.out.println( temp );
    }

    public static void min_value(HashMap<String, Integer> map1) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>( map1.entrySet() );
        Integer[] setValues = map1.values().toArray( new Integer[0] );
        Integer min = setValues[0];
        for (Integer value : setValues) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println( "min = " + min );
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put( "oneGone", 2 );
        map1.put( "fivefHivefive", 6 );
        map1.put( "threethrAeethreethree", 4 );
        map1.put( "niFnenine", 10 );
        map1.put( "seveBnseven", 8 );
        sort_map_values( map1 );
        System.out.println( "******************" );
        frequency_of_Characters( map1 );
        System.out.println( "******************" );
        unique_character_from_String( map1 );
        System.out.println( "******************" );
        min_value( map1 );

    }
}
