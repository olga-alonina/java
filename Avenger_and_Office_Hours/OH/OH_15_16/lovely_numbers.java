package OH.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lovely_numbers {
    public static int lovely(int num) {
        String[] arr = String.valueOf( num ).split( "" );
        ArrayList<String> list = new ArrayList<>( Arrays.asList( arr ) );
        for (int i = 0; i < list.size(); i++) {
            if ((Collections.frequency( list, list.get( i ) ) >= 3)) {
                return 0;
            }

        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println( "3 " + lovely( 0 ) );
        System.out.println( "4 " + lovely( 100 ) );
        System.out.println( "5 " + lovely( 111 ) );
        System.out.println( "6 " + lovely( 1232 ) );
        System.out.println( "7 " + lovely( 9922 ) );
        System.out.println( "8 " + lovely( 99922 ) );
        /*
        lovelyNumber(0)    ---returns 1
        lovelyNumber(100)  ---returns 1
        lovelyNumber(111)  ---returns 0
        lovelyNumber(1232) ---returns 1
        lovelyNumber(9922) ---returns 1
        lovelyNumber(99922)---returns 0*/
    }
}

