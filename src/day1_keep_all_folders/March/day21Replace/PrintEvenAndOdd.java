package day1_keep_all_folders.March.day21Replace;

public class PrintEvenAndOdd {

    //       print all the even numbers from 1 to 100, on separate lines
    //
    //        print all the odd numbers from 1 to 100, but all in one line with spaces between each number

    public static void main(String[] args) {
        int number = 2;
        while (number <= 100) {
            System.out.println(number);
            number += 2;
            //even
        int number2 =1;
        while(number2<=100){
            if(number2%2==0){
                System.out.println(number2);
            }
            number2++;
        }//odd
            int number3 =1;
            while(number3<=100){
                if(number3%2!=0){
                    System.out.print(number3+" ");
                    number3+=2;
                }}}}}



