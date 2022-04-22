package day1_keep_all_folders.February.day11_If_Statement;

import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = input.nextInt();
        if(temp>=70){
            System.out.println("Its nice day");}
        else{
            System.out.println("Its too cold, practice java");
        }
    }
}
