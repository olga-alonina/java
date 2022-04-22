package day1_keep_all_folders.homework.homeworkFeb15;

import java.util.Scanner;

public class bigger_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        if(number1>number2){
            System.out.println(number1+" is bigger");}
        else{
            System.out.println(number2+" is bigger");
        }
    }
}
//Create two number variables
//Find and print which number is bigger between the two
//ex:
//50
//45
//output:
//50 is bigger

