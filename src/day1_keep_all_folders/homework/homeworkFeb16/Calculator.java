package day1_keep_all_folders.homework.homeworkFeb16;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        char operator = '/';
        System.out.println("please enter operator");

        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        else if (operator == '-') {
            System.out.println(num1 - num2);
        }
        else if (operator == '*') {
            System.out.println(num1 * num2);
        }
        else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");
        }
    }}


       //+ : add num1 and num2
    //- : minus num1 and num2
    //* : multiply num1 and num2
    /// : divide num1 and num2
    //any other char: "invalid operator"

