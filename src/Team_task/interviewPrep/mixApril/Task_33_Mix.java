package Team_task.interviewPrep.mixApril;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_33_Mix {
    public static void main(String[] args) {
   /*     33. Write a Java program to find all interleavings of given strings. Go to the editor

        Sample Output:

        The given strings are: WX  YZ
        The interleavings strings are:
        YWZX
        WYZX
        YWXZ
        WXYZ
        YZWX
        WYXZ
                */

        String one = "WX";//4*4
        String two = "YZ";
        String res = "";
        String[] split1 = one.split( "" );
        String[] split2 = two.split( "" );
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.addAll( List.of( split1 ) );
        list.addAll( List.of( split2 ) );
        int count = 0;
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j <= 3; j++) {
                for (int i = 0; i < 3; i++) {
                    Collections.swap( list, i, i + 1 );
                    count++;
                    System.out.println( count );
                    System.out.println( list );

                }
            }
        }
    }
}



