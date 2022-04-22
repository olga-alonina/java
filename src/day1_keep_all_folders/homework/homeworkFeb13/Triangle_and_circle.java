package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class Triangle_and_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first angle number");
        int number1 = input.nextInt();
        System.out.println("First angle  number = " + number1);

        System.out.println("please enter second angle number");
        int number2 = input.nextInt();
        System.out.println("Second angle number = " + number2);

        System.out.println("please enter third angle number");
        int number3 = input.nextInt();
        System.out.println("Third angle number = " + number3);
        int total = number1 + number2 + number3;
        boolean isTriangle = total == 180;
        System.out.println("It is triangle? " + isTriangle);
        boolean isCircle = total == 360;
        System.out.println("It is circle? " + isCircle);


    /*Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0*/
    }

}
