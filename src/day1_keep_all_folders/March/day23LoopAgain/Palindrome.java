package day1_keep_all_folders.March.day23LoopAgain;

public class Palindrome {
    public static void main(String[] args) {


        String word = "mamaamam";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }System.out.println(reverse);
         if (word.equals(reverse)) {
            System.out.println("its Palindrome " + word);
        } else {
            System.out.println("Try again");
        }

    }
}


