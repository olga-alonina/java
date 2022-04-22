package day1_keep_all_folders.March.day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class student_info {
    public static void main(String[] args) {
        String[] stOne = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(stOne));

        String[] stTwo = new String[4];
        System.out.println(Arrays.toString(stTwo));
        stTwo[0] = "010";
        stTwo[1] = "Oleg";
        stTwo[2] = "Apple";
        stTwo[3] = "26";
        System.out.println(Arrays.toString(stTwo));

        String[] stThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id: ");
        stThree[0] = input.nextLine();
        System.out.println("Enter your first name");
        stThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        stThree[2] = input.nextLine();
        System.out.println("What is your batch number");
        stThree[3] = input.nextLine();
        System.out.println(Arrays.toString(stThree));

        String[] stFour = new String[4];
        String[] qiestion = {"Enter your id: ","Enter your first name","Enter your" +
                " last name","What is your batch number"};
        for(int i = 0; i<4; i++){
            System.out.println(qiestion[i]);
            stFour[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(stFour));
    }
}