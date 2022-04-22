package day1_keep_all_folders.homework.homeworkMarch5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String str1 = input.nextLine().trim().toLowerCase();
        String str2 = input.nextLine().trim().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("false");
        } else {
            for (int i = 0; i < str2.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str2.charAt(i) == str1.charAt(j)) {
                        str1 = str1.replaceFirst(str1.charAt(j) + "", "");
                       // break;
                    }
                }
            }
            if (str1.isBlank()) {
                System.out.println("anagram");
            } else {
                System.out.println("false");
            }
        }
    }}
