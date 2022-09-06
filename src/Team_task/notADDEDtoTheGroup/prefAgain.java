package Team_task.notADDEDtoTheGroup;

public class prefAgain {
    /*
Given a string, consider the prefix string made
of the first N chars of the string. Does that prefix string appear
 somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false*/
    public static boolean prefixAgain(String str, int n) {
        boolean prefixAgain =false;
        for (int i = 0; i < str.length()-1; i++) {
            if(!str.isEmpty()&&n>=1&&n<=str.length()){
                String pref = str.substring( 0,n );
                str = str.replaceFirst( pref,"" );
                if(str.contains( pref)){
                    prefixAgain = true;
                    break;
                }
            }
        }
        return prefixAgain;

    }

    public static void main(String[] args) {
        System.out.println( prefixAgain( "abXYabc", 1 ) );
        System.out.println( prefixAgain( "abXYabc", 2 ) );
        System.out.println( prefixAgain( "abXYabc", 3 ) );
    }
}
