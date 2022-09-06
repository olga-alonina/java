package Team_task.interviewPrep.mixMay;

public class loveTeen {
    /*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false*/
    public static boolean loneTeen(int a, int b) {
        boolean hasTeen = false;
        if ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) {
            hasTeen = true;
        } else if (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            hasTeen = true;
        }
        return hasTeen;
    }

    public static void main(String[] args) {
        System.out.println( loneTeen( 13, 99 ) );
        System.out.println( loneTeen( 21, 19 ) );
        System.out.println( loneTeen( 13, 13 ) );
    }
}
