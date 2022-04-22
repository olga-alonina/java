package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;
import java.util.Arrays;

public class Creating_Array_List {
    public static void main(String[] args) {
        ArrayList<String> newOne = new ArrayList<>();
        newOne.add("hello");
        newOne.add("bye");
        System.out.println(newOne);
        ArrayList<String> newTwo = new ArrayList<>(newOne);
        newTwo.add("Hola");
        System.out.println("Random_Numbers_sumToZero = " + newOne);
        System.out.println("newTwo = " + newTwo);
        ArrayList<String> newThree = new ArrayList<>(Arrays.asList("One", "Two","Three"));
        System.out.println("newThree = " + newThree);
       // ArrayList<String> newFour = new ArrayList<>("Four","Five", "Six");- not valid
    }
}

