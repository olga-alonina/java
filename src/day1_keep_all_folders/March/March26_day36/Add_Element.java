package day1_keep_all_folders.March.March26_day36;

import java.util.Arrays;

public class Add_Element {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = add_element(a, 4);
        System.out.println(Arrays.toString(b));
        System.out.println("**********************");
        String[] al = {"Ola", "Anna", "Alex"};
        String[] ab = add_Element(al, "Dan");
               System.out.println(Arrays.toString(ab));
        System.out.println("******************");
        int[] az = {1, 2, 3};
        int[] bz = {7, 8, 9,10,11};
        int[]rez = add_element(az,bz);
        System.out.println(Arrays.toString(rez));
    }

    public static int[] add_element(int[] original, int adding_element) {
        int[] newArr = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArr[i] = original[i];
        }
        newArr[newArr.length - 1] = adding_element;
        return newArr;
    }

    public static String[] add_Element(String[] original, String element) {
        String[] newOne = new String[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newOne[i] = original[i];
        }
        newOne[newOne.length - 1] = element;
        return newOne;
    }

    public static int[] add_element(int[] original, int[] adding_element) {
        int size = original.length + adding_element.length;
        int[] newOne = new int[size];
        newOne = Arrays.copyOf(original, size);
        for (int i = 0; i <= adding_element.length-1; i++) {
            newOne[original.length+i] = adding_element[i];
        }
        return newOne;

    }
}
