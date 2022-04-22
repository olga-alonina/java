package April11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {
    public static String frequencyDig(String str) {
        /* "AABCCDDEE"  ==> "ABCDE"
                                output=A2B1C2D2E2*/
        int count = 0;
        String[] temp = str.split( "" );
        String ret = "";

        ArrayList<String> newX = new ArrayList<>( Arrays.asList( temp ) );
        for (String each : temp) {
            if (!ret.contains( each )) {
                ret += each;
                count = Collections.frequency( newX, each );
                ret += count;
            }
        }
        return ret;

    }

    public static String frequencyDig1(String str2) {
        char[] chArray = str2.toCharArray();
        System.out.println( Arrays.toString( chArray ) );

        ArrayList<Character> chList = new ArrayList<>();

        for (Character each : chArray) {
            chList.add( each );
        }
        System.out.println( chList );

        String result2 = "";
        for (Character each : chList) {
            int freq = Collections.frequency( chList, each );

            if (result2.contains( "" + each )) {
                continue;
            }

            result2 += "" + freq + each;
        }

      return result2;
    }

    public static void main(String[] args) {
        String str = "AABCCDDEE";
        System.out.println( frequencyDig( str ) );
        System.out.println( "*************Char*************" );
        System.out.println( frequencyDig1( str ) );
    }
}
