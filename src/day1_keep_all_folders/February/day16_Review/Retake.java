package day1_keep_all_folders.February.day16_Review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter attempt:");
        int attempt = input.nextInt();
        System.out.println("Please enter grade:");
        int grade = input.nextInt();


        switch (attempt) {
            case 1:
                grade *= 0.9;
                break;
            case 2:
                grade *= 0.8;
                break;
            case 3:
                grade *= 0.65;
                break;
            default:
                System.out.println("Invalid number");

        }
        System.out.println("grade " + grade);

    }
}
