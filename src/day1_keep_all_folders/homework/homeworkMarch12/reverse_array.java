package day1_keep_all_folders.homework.homeworkMarch12;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 8, 9};
        int[] reverse = new int[num.length];
        for (int i = num.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = num[i];
        }
                System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(reverse));

        System.out.println("*******************");

        for (int i = num.length - 1; i >= 0; i--) {
            reverse[num.length - 1 - i] = num[i];
        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(reverse));

    }
}
