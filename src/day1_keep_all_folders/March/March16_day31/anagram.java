package day1_keep_all_folders.March.March16_day31;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        String fOne = "silent";
        String sOne = "listen";
        char[] newfOne = fOne.toCharArray();
        char[] newsOne = sOne.toCharArray();
        Arrays.sort(newfOne);
        Arrays.sort(newsOne);
        System.out.println(Arrays.toString(newfOne));
        System.out.println(Arrays.toString(newsOne));
        if (Arrays.equals(newfOne, newsOne)) {
            System.out.println("anagram");
        } else {
            System.out.println("Non anagram");
        }
    }
}
