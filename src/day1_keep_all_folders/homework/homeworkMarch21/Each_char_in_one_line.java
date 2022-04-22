package day1_keep_all_folders.homework.homeworkMarch21;

public class Each_char_in_one_line {
    //create a method that accepts a String and print
    // each character of the String on a separate line
    public static void each_Letter(String str) {
        String[] letters = str.split("");
        for (String each : letters) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        each_Letter("Alphabit");
    }
}
