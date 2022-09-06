package AH.April11;

import java.util.ArrayList;

public class Contain2OR3 {
    public static void main(String[] args) {
        int[] x = {2, 5, 4, 6, 8, 9};
        System.out.println( "1 ex= " + containDigits( x, 2, 3 ) );
        int[] y = {4, 3, 0, 100, 55};
        System.out.println( "2 ex= " + containDigits( y, 2, 3 ) );
        int[] z = {4, 5, 1, 5, 6};
        System.out.println( "3 ex= " + containDigits( z, 2, 3 ) );
    }

    public static boolean containDigits(int[] x, int number1, int number2) {

        for (int num : x) {
            if (num == number1 || num == number2) {
                return true;
            }
        }
        return false;
    }

    public static boolean containDigits(ArrayList<Integer> list, int number1, int number2) {
        if (list.contains( number1 ) || list.contains( number2 )) {
            return true;
        }
        return false;
    }
}
