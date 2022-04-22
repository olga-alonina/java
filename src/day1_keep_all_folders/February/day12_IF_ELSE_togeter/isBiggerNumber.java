package day1_keep_all_folders.February.day12_IF_ELSE_togeter;

import java.util.Scanner;

public class isBiggerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1>=number2&&number1>=number3){
            System.out.println(number1+" is bigger");}
        else
        if(number2>=1&&number2>=number3){
            System.out.println(number2+" is bigger");
        }
        else{
            System.out.println(number3 + " is bigger");
        }
    }
}


