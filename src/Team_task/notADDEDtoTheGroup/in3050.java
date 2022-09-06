package Team_task.notADDEDtoTheGroup;

public class in3050 {
    /*    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true*/
    public static boolean in3050(int a, int b) {
        if (Math.abs( a - b ) <= 10 && Math.abs( a - b ) >= 0) {
            if (a >= 30 && b >= 30 && a <= 40 && b <= 40) {
                return true;
            }
            else if (a >= 40 && b >= 40 && a <= 50 && b <= 50) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( in3050( 30, 31 ) );// → true
        System.out.println( in3050( 30, 41 ) );// false
        System.out.println( in3050( 40, 50 ) );// true
    }
}
