package day1_keep_all_folders.homework.HomeworkMarch6;

import java.util.Scanner;

public class vowels {

    //  Input:    //    howdyho
    //  Output:    //    oo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.toLowerCase();

        String vowels = "";

        for (int k = 0; k < word.length(); k++) {
            if (word.charAt(k) == 'a'|| word.charAt(k) == 'e' || word.charAt(k) == 'i'
                    || word.charAt(k) == 'o' || word.charAt(k) == 'u') {
                vowels += word.charAt(k);
            }
        }
        System.out.println(vowels);
    }
}
