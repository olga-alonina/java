package day1_keep_all_folders.March.March27_day37;

import java.util.ArrayList;

public class Array_List_Example {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println(number);
        number.add(100);
        System.out.println(number);
        number.add(300);
        number.add(200);
        System.out.println(number);

        System.out.println(number.get(1));
        System.out.println(number.size());
    }
}
