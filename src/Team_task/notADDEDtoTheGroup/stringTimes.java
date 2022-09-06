package Team_task.notADDEDtoTheGroup;

public class stringTimes {
    /*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"*/
    public static String stringTimes(String str, int n) {
        String stringTimes = "";
        for (int i = 0; i <n ; i++) {
            stringTimes+=str;
        }
        return  stringTimes;
    }

    public static void main(String[] args) {
        System.out.println( stringTimes( "Hi", 2 ) );
        System.out.println( stringTimes( "Hi", 3 ) );
        System.out.println( stringTimes( "Hi", 1 ) );
    }

}
