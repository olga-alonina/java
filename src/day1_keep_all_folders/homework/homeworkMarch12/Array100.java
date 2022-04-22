package day1_keep_all_folders.homework.homeworkMarch12;

import java.util.Arrays;

public class Array100 {
    public static void main(String[] args) {
        //1. Create an int array called numbers that has length of 100
        //2. Assign 1-100 to each index of the array. Then print your number
        //array
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}