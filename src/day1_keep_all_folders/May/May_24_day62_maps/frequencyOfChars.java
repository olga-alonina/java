package day1_keep_all_folders.May.May_24_day62_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfChars {
    public static void frequencyOfChars(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[]news = str.split( "" );
        for (int i = 0; i < news.length; i++) {
        int frequency = Collections.frequency(Arrays.asList( news ),news[i]);
        map.put( news[i],frequency );

        }System.out.println(map);
    }

    public static void main(String[] args) {
        frequencyOfChars( "apple" );
    }
}
