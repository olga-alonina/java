package OH.OH_1_12;

import java.util.Scanner;

public class SmallTask3part3 {
    /*Write a program to print absolute value of a number entered by user
					        ( Scanner Class can be used )

 							INPUT : 15			EXPECTED : Absolute value is 15

 							INPUT : -54			EXPECTED : Absolute value is 54	*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write number");
        int number = input.nextInt();

        if(number>0){
            System.out.println("Absolute value is "+number);
                    }
        else if(number<0){
            System.out.println("Absolute value is "+(-number) );
        }
        else {
            System.out.println("Your number is 0");
        }

}}
