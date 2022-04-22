package day1_keep_all_folders.homework.HomeworkMarch13;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        //3. Char array which will have some letter grade based on the score (empty)
        //4. Output the gradebook at the end with all the information
        //Grade scale:
        //Above 85: A         //Above 75: B         //Above 65: C         //Other: D
        //Challenge: Accept all the information with Scanner
        Scanner input = new Scanner(System.in);

        String[] names = new String[6];
        int[] score = new int[names.length];
        char[] grade = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter your full name");
            names[i] = input.next().trim();
            System.out.println("Enter your score");
            score[i] = input.nextInt();

            if (score[i] >= 85) {
                grade[i] = 'A';
            } else if (score[i] < 85 && score[i] > 75) {
                grade[i] = 'B';
            } else if (score[i] < 75 && score[i] > 65) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("" + names[i] + "|" + score[i] + "|" + grade[i]);
        }
    }
}
