package day1_keep_all_folders.homework.homeworkMarch29;

import java.util.ArrayList;

public class Characters {
    public static ArrayList<String> characters() {
        ArrayList<String> characters = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            characters.add(i + "");
        }
        return characters;
       /*Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters*/
    }

    public static void main(String[] args) {
        System.out.println(characters());
    }
}
