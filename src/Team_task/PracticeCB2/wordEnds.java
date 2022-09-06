package Team_task.PracticeCB2;

public class wordEnds {
    //    Given a string and a non-empty word string, return a string made of
//    each char just before and just after every appearance of the word in the string.
//    Ignore cases where there is no char before or after the word, and a char may be
//    included twice if it is between two words.
//    wordEnds("abcXY123XYijk", "XY") → "c13i"
//    wordEnds("XY123XY", "XY") → "13"
//    wordEnds("XY1XY", "XY") → "11"
    public static String wordEnds(String str, String word) {
        String wordEnds = "";
        if (str.length() < 3) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt( i ) == word.charAt( 0 )) {
                if (i == 0) {
                    wordEnds += str.charAt( i + 1 + word.length() - 1 );
                    i += word.length()-1;
                    continue;
                }
                if (i == str.length() - word.length()) {
                    wordEnds += str.charAt( i - 1 );
                } else {
                    wordEnds += str.charAt( i - 1 );
                    wordEnds += str.charAt( i + 1 + word.length() - 1 );
                    continue;

                }
            }
        }
        return wordEnds;
    }

    public static void main(String[] args) {
        System.out.println( wordEnds( "XYXY", "XY" ) );
    }
}
