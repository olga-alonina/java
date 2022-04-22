package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        System.out.println("Your number is: " + number);
        boolean even_number = 0==number%2;
        boolean odd_number = 1==number%2;
        System.out.println("odd_number = " + odd_number);
        System.out.println("even_number = " + even_number);

    /*Ask the user to enter an int number. Determine if the number is even or odd
Print a boolean for both even and odd*/
}

}
