package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;

public class multiArray_ex {
    public static void main(String[] args) {
        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};

        int[][] all = {n, m};
        //System.out.println(all);//its print symbols, don'title do it
        //System.out.println(Arrays.toString(all));//its print symbols, don'title do it
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));

        System.out.println("***********************");
        int[][] multi = {
                {90, 80, 70},  // index 0 array
                {19, 51, 1129, 12}, // index 1 array
                {10, 1900}, // index 2 array
                {14}       // index 3 array
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);
       // System.out.println(multi[3][1]); give you error in array 3 we have onlu 0 index. not 1,2 or others
    }
}
