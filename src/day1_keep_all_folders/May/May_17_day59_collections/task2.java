package day1_keep_all_folders.May.May_17_day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class task2 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add( null );
        set.add( "hello" );
        set.add( "$4.5" );
        set.add( "Hello" );
        set.add( "%" );
        set.add( "400" );
        set.add( "400" );
        System.out.println( set );

        Set<String> set1 = new HashSet<>();
        set1.add( null );
        set1.add( "hello" );
        set1.add( "$4.5" );
        set1.add( "400" );
        set1.add( "Hello" );
        set1.add( "%" );
        System.out.println( set1 );

        Set<String> set3 = new TreeSet<>();
        set3.add( null );
        set3.add( "hello" );
        set3.add( "$4.5" );
        set3.add( "400" );
        set3.add( "Hello" );
        set3.add( "%" );
        System.out.println( set3 );

    }
}
