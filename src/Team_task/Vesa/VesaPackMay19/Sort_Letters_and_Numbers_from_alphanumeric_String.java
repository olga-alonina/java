package Team_task.Vesa.VesaPackMay19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Input:  "DC501GCCCA098911"
Output: "CD015ACCCG011899"*/
public class Sort_Letters_and_Numbers_from_alphanumeric_String {
    public static void main(String[] args) {
        sort_Letters_and_Numbers( "DC501GCCCA098911" );

    }

    public static void sort_Letters_and_Numbers(String str) {
        //1 declare variables
        String part1 = "";
        String part2 = "";
        String[] temp2 = new String[0];
        String[] temp = new String[0];

        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        //2 converting string to charArray
        char[] news = str.toCharArray();
        //3 sorting array to:
        for (int i = 0; i < news.length; i++) {
            //3a letters
            if (Character.isLetter( news[i] )) {
                if (!result.containsAll( List.of( temp2 ) )) {
                    result.addAll( List.of( temp2 ) );
                }
                part2 = "";
                part1 += news[i];
                temp = part1.split( "" );
                Arrays.sort( temp );
            }
            //3b numbers
            if (Character.isDigit( news[i] )) {
                if (!result.containsAll( List.of( temp ) )) {
                    result.addAll( List.of( temp ) );
                }
                part1 = "";
                part2 += news[i];
                temp2 = part2.split( "" );
                Arrays.sort( temp2 );

            }
        }//we dont have any movement to letters. so last part of numbers we add here
        if (!result.containsAll( List.of( temp2 ) )) {
            result.addAll( List.of( temp2 ) );
        }
        System.out.println( result );
    }
}


