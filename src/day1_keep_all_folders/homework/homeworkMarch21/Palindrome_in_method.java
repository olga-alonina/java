package day1_keep_all_folders.homework.homeworkMarch21;

public class Palindrome_in_method {
    public static String palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt( i );

        }
        if (word.equals( reverse )) {
            return word;
        } else {
            return "Try again";
        }
    }

    public static void main(String[] args) {
        System.out.println( palindrome( "watermlon" ) );
        System.out.println( palindrome( "racecar" ) );
    }
}
