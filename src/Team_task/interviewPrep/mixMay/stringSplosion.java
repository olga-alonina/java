package Team_task.interviewPrep.mixMay;

public class stringSplosion {
    /*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
     */
    public static String stringSplosion(String str) {
        String stringSplosion = "";
        String temp = "";
        String[] news = str.split( "" );
        for (int i = 0; i <= news.length; i++) {
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    stringSplosion += news[j];
                }
            }
        }
        return stringSplosion;
    }

    public static void main(String[] args) {
        System.out.println( stringSplosion( "Code" ) );
        System.out.println( stringSplosion( "abc" ) );
        System.out.println( stringSplosion( "ab" ) );
    }

}
