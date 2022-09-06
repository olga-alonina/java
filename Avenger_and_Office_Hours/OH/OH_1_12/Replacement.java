package OH.OH_1_12;

import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write your number");
        int number = input.nextInt();
        String result = " ";

        if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
            result += "Codility";
            result += "Test_new";
            result += "Coders";
        } else if (number % 2 == 0 && number % 3 == 0) {
            result += "Codility";
            result += "Test_new";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result += "Test_new";
            result += "Coders";
        } else if (number % 2 == 0 && number % 5 == 0) {
            result += "Codility";
            result += "Coders";
        }
        System.out.println("Result = " + result);
    }
}


              /*  if (number % 2 != 0) {
            System.out.println("TestCoders");
            if (number % 3 != 0) {
                System.out.println("Coders");
                if (number % 5 != 0) {
                    System.out.println("This number could not be divided by 2,3 or 5");*/



