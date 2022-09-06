package OH.OH_1_12;

import java.util.Scanner;

public class AgeAndWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write your age");
        int age = input.nextInt();
        System.out.println("please write your weight");
        int weight = input.nextInt();
        String result = " ";

        if (age >= 18 && weight > 50) {
            result = "You are eligible to donate blood";
        } else if (age >= 18 && weight <= 50) {
            result = "You are not eligible to donate blood";
        } else if (age < 18) {
            result = "Age must be greater than 18";
        }
        System.out.println(result);
    }
}


    /*
					        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"*/

