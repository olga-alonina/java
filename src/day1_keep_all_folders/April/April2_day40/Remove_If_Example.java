package day1_keep_all_folders.April.April2_day40;


import java.util.ArrayList;
import java.util.Arrays;

public class Remove_If_Example {
    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>( Arrays.asList( 6, 8, 5, 46, 2, 1, 4, 5, 4, 2 ) );
        ArrayList<Integer> nums = new ArrayList<>( base );
        nums.removeIf( n -> n % 2 == 0 );
        System.out.println( "remove if = " + nums );
        ArrayList<Integer> nums2 = new ArrayList<>( base );
        nums2.removeIf( each -> each > 10 );
        System.out.println( "nums2 = " + nums2 );
        ArrayList<String> days = Array_List_With_Method.get_Days_Of_The_Week();
        days.removeIf( day -> day.startsWith( "S" ) || day.startsWith( "T" ));
        System.out.println( days );
    }
}
