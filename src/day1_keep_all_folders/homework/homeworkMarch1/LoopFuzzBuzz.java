package day1_keep_all_folders.homework.homeworkMarch1;

public class LoopFuzzBuzz {
    public static void main(String[] args) {
       int number = 1;

        while (number <= 50) {
            if (number % 3 == 0 && number % 5 != 0) {
                System.out.print(" Fizz ");
            } else if (number % 5 == 0 && number % 3 != 0) {
                System.out.print(" Buzz ");
            } else if (number % 5 == 0 && number % 3 == 0) {
                System.out.print(" FizzBuzz\n ");
            } else {
                System.out.print(number+" ");}
               number++;
            }
        }

    }





