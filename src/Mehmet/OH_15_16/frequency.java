package Mehmet.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class frequency {
    public static void main(String[] args) {
        System.out.println( "find the Frequency of character from a String" );
        String str = "AABBCCDDEEEF";
    }

    public static String frequency_Of_Character(String str) {
        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split( "" ) ) );
        ArrayList<String> temp = new ArrayList<>();
        int count = 0;
        String res = "";

        for (int i = 0; i < list.size(); i++) {

            if (!temp.contains( list.get( i ) )) {
                temp.add( list.get( i ) );
                count = Collections.frequency( list, list.get( i ) );
                temp.add( String.valueOf( count ) );
            }
        }

        for (String element : temp) {
            res += element;
        }

        return (res);
    }

    public static String frequency_Of_Character1(String str) {
        String result = "";
        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split( "" ) ) );
        // in order to be able to use Frequency method
        for (String each : list) {
            int frequency = Collections.frequency( list, each );
            if (result.contains( each )) { // to avoid duplicated characters in the result
                continue;
            }
            result += each + frequency;
        }
        return (result);
    }
}
