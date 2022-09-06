package Team_task.interviewPrep.mixApril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_34_AsAlexLike {
    public static void main(String[] args) {
        String str = "succeseees";
        ArrayList<String> list2 = getStrings( str );
        extracted( list2 );
        extractedAfterRemove( list2 );

    }

    public static void extractedAfterRemove(ArrayList<String> list2) {
        int max2 = Integer.parseInt( list2.get( 1 ) );
        max2 = getMax2( list2, max2 );
        System.out.println( max2 );
        System.out.println( list2.get( list2.indexOf( String.valueOf( max2 ) ) - 1 ));
    }

    public static void extracted(ArrayList<String> list2) {
        int max = Integer.parseInt( list2.get( 1 ) );
        max = getMax( list2, max );
        int n = list2.indexOf( String.valueOf( max ) );
        list2.remove( n - 1 );
        list2.remove( String.valueOf( max ) );
        System.out.println( list2 );
    }

    public static ArrayList<String> getStrings(String str) {
        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split( "" ) ) );
        ArrayList<String> list2 = new ArrayList<>();
        extracted( list, list2 );
        System.out.println( list2 );
        return list2;
    }

    public static int getMax2(ArrayList<String> list2, int max2) {
        for (int j = 1; j < list2.size(); j += 2) {
            int number = Integer.parseInt( list2.get( j ) );
            if (number > max2) {
                max2 = number;
            }
        }
        return max2;
    }

    public static int getMax(ArrayList<String> list2, int max) {
        for (int i = 1; i < list2.size(); i += 2) {
            int number = Integer.parseInt( list2.get( i ) );
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void extracted(ArrayList<String> list, ArrayList<String> list2) {
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency( list, list.get( i ) );
            if (!list2.contains( list.get( i ) )) {
                list2.add( list.get( i ) );
                list2.add( "" + count );
            }
        }
    }
}

