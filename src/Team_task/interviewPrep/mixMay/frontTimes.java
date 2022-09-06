package Team_task.interviewPrep.mixMay;

public class frontTimes {
    /*
Given a string and a non-negative int n, we'll say that
 the front of the string is the first 3 chars,
  or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"*/
    public static String frontTimes(String str, int n) {
        String frontTimes = "";
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                if (str.length() >= 3) {
                    frontTimes += str.substring( 0, 3 );
                } else {
                    frontTimes += str;
                }
            }
        }

        return frontTimes;
    }

    public static void main(String[] args) {
        System.out.println( frontTimes( "Chocolate", 2 ) );
        System.out.println( frontTimes( "Chocolate", 3 ) );
        System.out.println( frontTimes( "Abc", 3 ) );
    }

}
