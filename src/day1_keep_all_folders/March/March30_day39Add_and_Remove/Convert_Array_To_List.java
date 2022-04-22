package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_Array_To_List {
    public static void main(String[] args) {
        Integer[] srr = {1, 2, 3};
        Arrays.asList(srr);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("nums = " + nums);

        ArrayList<Integer> others = new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println("others = " + others);
        
    }

}

