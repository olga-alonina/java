package Team_task.notADDEDtoTheGroup;

public class sameStarChar {
    /*Returns true if for every '*' (star) in the string,
    if there are chars both immediately before and after the star, they are the same.
sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true*/
    public static boolean sameStarChar(String str) {
        String res = "";
        if (str.length() < 3 || !str.contains( "*" )) {
            return true;
        }
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt( i ) == '*') {
                if (i == 0 || i == str.length() - 1) {
                    continue;
                } else if (str.charAt( i - 1 ) == str.charAt( i + 1 )) {
                    res += "true";
                } else {
                    res += "false";
                }
            }
        }
        if (res.lastIndexOf( "true" ) > res.lastIndexOf( "false" )) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( sameStarChar( "*xa*a*b" ) );

    }
}
