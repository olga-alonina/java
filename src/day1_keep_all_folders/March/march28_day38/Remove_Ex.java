package day1_keep_all_folders.March.march28_day38;

import java.util.ArrayList;

public class Remove_Ex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);
        System.out.println("***Remove***");
        list.remove(0);
        System.out.println(list);
        System.out.println("*******Remove last index***************");
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println("****Remove sun********");
        list.remove("sun");
        System.out.println(list);
        System.out.println(list.remove("apple"));// if its boolean expression you need to print it
        System.out.println(list);
        System.out.println("**************");
        list.add("wind");
        list.add("wind");
        list.add("wind");
        System.out.println(list);
        list.remove("wind");
        System.out.println(list);


    }
}
