package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;

public class Averege_of_each {
    public static void main(String[] args) {
          /*    Given a 2D array find the average of each inner array
    and extra: average of the whole array
    Ex:
        3, 4, 5, 6
        5, 2, 6
        10, 20, 30
     */
//                  12/3        13/3     60/3
        int[][] arr = {{3, 4, 5,6}, {5, 2, 6}, {10, 20, 30}};

        int total_lehgth = 0;
        double total = 0;

        for (int[] array : arr) {
            double sum = 0;

            for (int number : array) {
                sum += number;
            }
            System.out.println(Arrays.toString(array) + "" +
                    "averege is " + sum / array.length);
            total += sum;
            total_lehgth += array.length;
        }
        System.out.println("averege of whole array =" + total / total_lehgth);
    }
}

