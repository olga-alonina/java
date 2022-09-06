package Extra_Tasks;

public class QCB_xyzThere {
    /*
Return true if the given string contains an
appearance of "xyz" where the xyz is not directly preceeded
by a period (.). So "xxyz" counts but "x.xyz" does not.
xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true*/
    public static boolean xyzThere(String str) {
        boolean xyzThere = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.contains( "xyz" )) {
                int before = str.indexOf( "xyz" );
                if (before == 0 || str.charAt( before - 1 ) != '.') {
                    xyzThere = true;

                }str = str.substring( before+3, str.length());
            }
        }
        return xyzThere;
    }

    public static void main(String[] args) {
        System.out.println( xyzThere( "abcxyz" ) );
        System.out.println( xyzThere( "abc.xyz" ) );
        System.out.println( xyzThere( "xyz.abc" ) );
        System.out.println(xyzThere(  "abc.xyzxyz") );
    }
}

