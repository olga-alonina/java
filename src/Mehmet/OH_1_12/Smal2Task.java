package Mehmet.OH_1_12;

import java.util.Scanner;

public class Smal2Task {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your temp");
        int temp = input.nextInt();

        if(temp>=70&&temp<=80){
            System.out.println("Ideal temp");
                    }
        else{
            System.out.println("Your temp is not ideal");
        }*/
    //Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter b");
        int b = input.nextInt();
        System.out.println("please enter number c");
        int c = input.nextInt();
        int a;

        if (c > 100 && b == 50) {
            System.out.println("a = "+(a = 20));
        }else{
            System.out.println("Incorrect numbers");
        }
    }
}
