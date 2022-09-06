package OH.OH_1_12;

import java.util.Scanner;

public class Small3Tasks {
    /*1 Create a program that will accept a number and it will print this statements  according to condition ;
					        ( Scanner Class can be used )
					        EXPECTED
							        Input : 10    Output : This  is positive number
							        Input : -3    Output : This  is negative number */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write your number");
        int number = input.nextInt();
        String result = " ";

        if (number > 0) {
            result = "This  is positive number";}
        else if (number < 0) {
            result = "This  is negative number";
        } else {
            result = "This  number is equal 0";
        }
        System.out.println(result);

    }
}

