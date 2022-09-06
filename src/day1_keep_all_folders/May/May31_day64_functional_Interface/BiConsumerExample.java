package day1_keep_all_folders.May.May31_day64_functional_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> print_N_Times = (str, n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println( str );
            }

        };
        Map<String, Integer> map = new HashMap<>();
        map.put( "One", 1 );
        map.put( "Two", 2 );
        map.put( "Three",3 );
        map.forEach( (key, value)->{
            System.out.println(value+key.length());
        } );



        //examples
        print_N_Times.accept( "Ola win", 2 );
    }
}
