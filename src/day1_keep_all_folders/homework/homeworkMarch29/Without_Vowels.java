package day1_keep_all_folders.homework.homeworkMarch29;

import java.util.ArrayList;

import static day1_keep_all_folders.homework.homeworkMarch29.Characters.characters;

public class Without_Vowels {
    public static ArrayList<String>without_Vowels() {
        ArrayList<String> wOv = characters();
        wOv.remove("A");
        wOv.remove("O");
        wOv.remove("E");
        wOv.remove("I");
        wOv.remove("U");
       return wOv;
    }

    public static void main(String[] args) {
        System.out.println(without_Vowels());
    }
}
