package Team_task.PracticeCB2;

public class starOUT {
    /*  Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
      starOut("ab*cd") → "ad"
      starOut("ab**cd") → "ad"
      starOut("sm*eilly") → "silly"*/
    public static String starOut(String str) {
        int i = 0;
        if (str.length() == 1 && str.charAt( i ) == '*') {
            return "";
        }
        while (str.contains( "*" )) {
            if (str.charAt( i ) == '*') {
                if (str.indexOf( "*" ) == 0) {
                    str = str.replaceFirst( "\\*", "" );
                    str = str.replaceFirst( "" + str.charAt( i ), " " );
                    continue;
                }
                if (str.indexOf( "*" ) == str.length() - 1) {
                    str = str.replaceFirst( "\\*", "" );
                    str = str.replaceFirst( "" + str.charAt( str.length() - 1 ), " " );
                } else {
                    str = str.replaceFirst( "" + str.charAt( i - 1 ), " " );
                    while (str.charAt( i ) == '*') {
                        str = str.replaceFirst( "\\*", "" );

                    }
                    i--;
                    str = str.replaceFirst( "" + str.charAt( i + 1 ), " " );
                    continue;
                }
            }
            i++;
        }
        str = str.replace( " ", "" );
        return str;
    }

    public static String starOut2(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt( i ) == '*' && i == 0) {
                i++;
            } else if (str.charAt( i ) == '*' && i == str.length() - 1) {
                s = s.substring( 0, s.length() - 1 );
            } else if (str.charAt( i ) == '*' && str.charAt( i + 1 ) == '*' && str.charAt( i + 2 ) == '*') {
                s = s.substring( 0, s.length() - 1 );
                i += 3;
            } else if (str.charAt( i ) == '*' && str.charAt( i + 1 ) == '*') {
                s = s.substring( 0, s.length() - 1 );
                i += 2;
            } else if (str.charAt( i ) == '*' && i != str.length() - 1) {
                s = s.substring( 0, s.length() - 1 );
                i++;

            } else s += str.charAt( i );
        }
        return s;
    }


    public static void main(String[] args) {
        System.out.println( starOut( "*str*in*gy*" ) );
    }
}