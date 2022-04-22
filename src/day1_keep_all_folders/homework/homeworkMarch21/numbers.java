package day1_keep_all_folders.homework.homeworkMarch21;

public class numbers {
    //create a method that will accept a number.
    // Find and print if it is a positive number, negative number, or zero
    public static void positive(int number) {
        if (number > 0) {
            System.out.println("Its positive");
        } else {
            System.out.println("Its not positive");

        }
    }

    public static void negative(int number) {
        if (number < 0) {
            System.out.println("Its negative");
        } else {
            System.out.println("Its not negative");
        }
    }

    public static void zero(int number) {
        if (number == 0) {
            System.out.println("Its zero");
        }else {
            System.out.println("Its not zero");
    }}

    public static void main(String[] args) {
        positive(7);
        negative(-6);
        zero(0);
    }
}
