package Team_task.notADDEDtoTheGroup;

public class StringMatch {
    /*    Given 2 strings, a and b, return the number of the positions
    where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz"
    yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
        stringMatch("xxcaazz", "xxbaaz") → 3
        stringMatch("abc", "abc") → 2
        stringMatch("abc", "axc") → 0*/
    public static int stringMatch(String a, String b) {
        //1 declare variables
        int count = 0;
        int size = 0;
        //2 compare size if the input words
        if (a.length() <= b.length()) {
            size = a.length() - 1;
        } else {
                size = b.length() - 1;
        }
        //3 looping from 0 till size of the smallest word
        for (int i = 0; i < size; i++) {
            //4 assign  2 chars of each word to 2 variables
            String a2letters = a.charAt( i ) + "" + a.charAt( i + 1 );
            String b2letters = b.charAt( i ) + "" + b.charAt( i + 1 );
           //5 verify that 2 variables are same
            if (b2letters.equals( a2letters )) {
                //6 increase if it's true
                count++;
            }
        }
        //7 return
        return count;
    }

    public static void main(String[] args) {
        System.out.println( stringMatch( "xxcaazz", "xxbaaz" ) );// → 3
        System.out.println( stringMatch( "abc", "abc" ) ); //→ 2
        System.out.println( stringMatch( "abc", "axc" ) );// → 0
    }
}
