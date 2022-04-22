package day1_keep_all_folders.homework.homeworkMarch29;

import java.util.ArrayList;

public class Remove_From_Array {
    public static void main(String[] args) {
        ArrayList<String> rem = new ArrayList<>();
        rem.add("Iron Man");
        rem.add("Spider Man");
        rem.add("Thor");
        rem.add("Captain America");
        rem.add("Hawkeye");
        rem.remove(2);//Thor remove
        rem.remove(0);//remove Iron Man
        System.out.println(rem);
    }
}
