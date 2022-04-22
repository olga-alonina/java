package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class People_info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your age");
        byte age = input.nextByte();
        System.out.println("Your age is:" + age);

        System.out.println("please enter your favorite number");
        long favNumber = input.nextLong();
        System.out.println("Your favorite number is " + favNumber);

        System.out.println("please enter your favorite book");
        input.nextLine();
        String favBook = input.nextLine();
        System.out.println("Your favorite book is " + favBook);

        System.out.println("I have a student " + age + " years old with " + favNumber + " favorite book,\n" +
                " but one of lucky book is " + favBook);


    /*
and ask them to enter their favorite book
Print all the values from the inputs*/

    }
}