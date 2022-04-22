package day1_keep_all_folders.homework.homeworkMarch12;

import java.util.Arrays;

public class move_0 {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5, 0, 1, 0};
        //               0  1 2 3 4 5

        int[] newOne = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                newOne[count] = numbers[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newOne));

        System.out.println("**************************");
        int[] newOne1 = new int[numbers.length];
        int count1 = 0;
        for (int each : numbers) {
            if (each != 0) {
                newOne1[count] = each;
                count1++;
            }
        }
        System.out.println(Arrays.toString(newOne));
    }
}




