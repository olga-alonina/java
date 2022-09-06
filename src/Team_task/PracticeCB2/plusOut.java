package Team_task.PracticeCB2;

public class plusOut {

    //    Given a string and a non-empty word string, return a version of the original
//    String where all chars have been replaced by pluses ("+"), except for appearances
//    of the word string which are preserved unchanged.
//    plusOut("12xy34", "xy") → "++xy++"
//    plusOut("12xy34", "1") → "1+++++"
//    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    public static String plusOut(String str, String word) {
        String plusOut = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf( word ) == i) {
                if (Character.isLetter( word.charAt( 0 ) )||Character.isDigit( word.charAt( 0 ) )) {
                    if (str.indexOf( word ) == i) {
                        plusOut += word;
                        str = str.replaceFirst( word, "" );
                        i--;
                    }
                } else {
                    plusOut += word;
                    str = str.substring( 0, i + 1 ) + str.substring( i + word.length(), str.length() );
                }
            } else {
                plusOut += "+";
            }
        }
        return plusOut;
    }

    public static void main(String[] args) {
       System.out.println( plusOut( "12xy34", "xy" ) );
        System.out.println( plusOut( "12xy34xyabcxy", "xy" ) );//"++xy++"
        System.out.println( plusOut( "--++ab", "++" ) );//++ ++ ++

    }
}
