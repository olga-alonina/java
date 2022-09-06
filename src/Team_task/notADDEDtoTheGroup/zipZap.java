package Team_task.notADDEDtoTheGroup;

public class zipZap {
    /* Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     zipZap("zipXzap") → "zpXzp"
     zipZap("zopzop") → "zpzp"
     zipZap("zzzopzop") → "zzzpzp"*/
    public static String zipZap(String str) {
        String zipZap = "";
        if (str.length() < 3) {
            for (int j = 0; j < str.length(); j++) {
                zipZap += str.charAt( j );
            }
        }
        if (str.length() >= 3) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt( i ) != 'z') {
                    zipZap += str.charAt( i );
                }
                if (str.charAt( i ) == 'z' && str.charAt( i + 2 ) == 'p') {
                    zipZap += str.charAt( i );
                    str = str.replaceFirst( "" + str.charAt( i + 1 ), " " );
                    zipZap += str.charAt( i + 2 );
                    i += 2;
                }
                if (str.charAt( i ) == 'z' && str.charAt( i + 2 ) != 'p') {
                    zipZap += str.charAt( i );
                }
            }
        }
        return zipZap;
    }

    public static void main(String[] args) {
//        System.out.println( zipZap( "zipXzap" ) );
//        System.out.println( zipZap( "zopzop" ) );
        //   System.out.println( zipZap( "zzzopzop" ) );
//        System.out.println( zipZap( "zi" ) );//"zi"
//        System.out.println( zipZap( "z" ) );//"z"
        System.out.println( zipZap( "abcppp" ) );//"abcppp"
        System.out.println( zipZap( "azbcppp" ) );//"azbcppp"
    }
}
