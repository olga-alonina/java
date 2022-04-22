package day1_keep_all_folders.March.March20_day33;

public class Calc {
    public static void add(double num1, double num2) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

    }

    public static void minus(double num1, double num2) {
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
    }

    public static void multi(double num1, double num2) {
        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
    }

    public static void div(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
            System.err.println("You could not divide by zero");//err=> make it red
        }

    }

    public static void main(String[] args) {
        add(2, 2);
        minus(6, 3);
        multi(2.5, 16);
        div(16, 0);
    }
}
