package day1_keep_all_folders.March.march28_day38;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);
        group.add(0,"Victor");
        System.out.println(group);
        System.out.println(group.get(0));
        System.out.println(group.get(1));
        group.add("Ozi");
        System.out.println(group); //[Victor, Ziba, Ozi]

        group.add(1, "James");
        System.out.println(group);//[Victor, James, Ziba, Ozi]

        System.out.println(group.add("Emre"));
        System.out.println(group);

    }
}

