package Mehmet.OH_1_12;

import java.util.Scanner;

public class SmallTask3part2 {
    /*2- Take values of length and width of a rectangle from user and check if it is square or not.
					        ( Scanner Class can be used )*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write length: ");
        int length = input.nextInt();
        System.out.println("please write width: ");
        int width = input.nextInt();

        if (length == width) {
            System.out.println("it is square");
        } else {
            System.out.println("this is other figure");
        }
    }
}
