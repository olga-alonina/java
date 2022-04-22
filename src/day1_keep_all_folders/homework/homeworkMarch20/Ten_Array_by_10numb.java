package day1_keep_all_folders.homework.homeworkMarch20;

import java.util.Arrays;

public class Ten_Array_by_10numb {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int[] insideArray : array) {
            for (int i = 0; i <= insideArray.length - 1; i++) {//123456789
                for (int k = 0; k <= insideArray.length - 1; k++) {//11 12 13
                    array[i][k] = 10*i+1+k;
                }
            }System.out.println(Arrays.toString(insideArray));
        }
        System.out.println();


    }
}

