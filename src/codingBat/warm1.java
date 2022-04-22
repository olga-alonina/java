package codingBat;

public class warm1 {
    //       The parameter weekday is true if it is a weekday,
    //       and the parameter vacation is true if we are on vacation.
    //       We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


    public static boolean posNeg(int a, int b, boolean negative) {
        boolean IsposNeg = false;
        if ((a < 0 && b < 0 && negative) == true) {
            IsposNeg = true;
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            IsposNeg = false;
        }
        return IsposNeg;
    }
    public static void main(String[] args) {

        System.out.println(posNeg(-4,5,true));

    }
}



