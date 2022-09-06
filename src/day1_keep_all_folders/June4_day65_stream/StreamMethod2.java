package day1_keep_all_folders.June4_day65_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {//todo check all previous code on this day from git

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ) );
        List<Integer> by_2 = list.stream().map( e -> e * 2 ).collect( Collectors.toList() );
        System.out.println( "list = " + list );
        System.out.println( "by_2 = " + by_2 );
        List<String> days = new ArrayList<>(
                Arrays.asList( "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" ) );
        List<String> abr = days.stream().map( day -> day.substring( 0, 3 ) ).collect( Collectors.toList() );
        System.out.println( "days = " + days );
        System.out.println( "abr = " + abr );
        System.out.println(" ************Filter***********" );
        List<Integer> list2 = new ArrayList<>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ) );
        List<Integer> even = list2.stream().filter( (p->p%2==0) ).collect( Collectors.toList() );
        System.out.println( "even = " + even );
        List<Integer> odd = list2.stream().filter( (p->p%2==1) ).collect( Collectors.toList() );
        System.out.println( "odd = " + odd );
        System.out.println("count()even = " + list2.stream().filter( (p -> p % 2 == 0) ).count() );
        System.out.println("count()unique even = " + list2.stream().filter( (p -> p % 2 == 0) ).distinct().count() );
    }
}
