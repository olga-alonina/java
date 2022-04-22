package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Elements {
    public static void main(String[] args) {
          /*

    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number*/

    /*Ex:
        {45, 123, 62}
        adding 100
        {45, 124, 62, 100}

     */
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you wanna have?");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("please enter new number");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] newAdd_to_Arr = Arrays.copyOf(arr, size + 1);
        System.out.println("please enter last number");
        newAdd_to_Arr[newAdd_to_Arr.length-1] = input.nextInt();
        System.out.println(Arrays.toString(newAdd_to_Arr));

    }
}
