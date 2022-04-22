package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;

public class add_and_remove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");
        String item =list.remove(0);
        System.out.println("item = " + item);
        System.out.println("list = " + list);
       boolean removed =list.remove("mouse");
        System.out.println("removed = " + removed);
        System.out.println("list = " + list);
    }
}
