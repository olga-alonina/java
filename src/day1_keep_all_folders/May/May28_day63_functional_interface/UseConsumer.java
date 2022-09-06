package day1_keep_all_folders.May.May28_day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {
        Consumer<Integer> printToN = n -> {
            for (int i = 0; i < n; i++) {
                System.out.print( i + " " );
            }
        };
        printToN.accept( 50 );
        System.out.println();
        List<String> list = new ArrayList<>( Arrays.asList( "hello", "summer", "pool", "warm" ) );
        list.forEach( e -> System.out.println( e ) );
        list.forEach( e -> {
            System.out.println( e.charAt( 0 ) + " " + e.charAt( e.length() - 1 ) );
        } );
        list.forEach( word->{
            if(word.length()<5){
                System.out.println(word);
            }
        } );
    }
}
