package AH.May16;

public class divide_WO_manipulations {
    /* Write a program that can return the sum of digits of an integer. Do not use any string manipulations.
   Input: 123  Output: 6*/
    public static int sum_of_digits(Integer number) {
        //  number = Math.abs(number);//also TOdo check this Math.class for useful methods
        int sum = 0;
        do {
            int num = number % 10;
            sum+=num;
            number = number/10;
        } while (number > 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( sum_of_digits( 11123 ) );
    }
}
