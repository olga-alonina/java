package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_With_Method {
    public static ArrayList<String> get_Days_Of_The_Week() {
        ArrayList<String> days = new ArrayList<>( Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ) );
        return days;
    }

    public static String printList(ArrayList<String> list) {
        String str = " List: ";
        for (String each : list) {
            str += "\n~\t" + each;
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println( get_Days_Of_The_Week() );
        ArrayList<String> days = get_Days_Of_The_Week();
        System.out.println( "Wth just Check_Six " + days.get( 0 ) );
        System.out.println( "With method " + get_Days_Of_The_Week().get( 0 ) );
        ArrayList<String> list = new ArrayList<>( Arrays.asList( "One", "Two", "Three" ) );
        System.out.println( printList( list ) );
        System.out.println(printList( days ));
    }
}
