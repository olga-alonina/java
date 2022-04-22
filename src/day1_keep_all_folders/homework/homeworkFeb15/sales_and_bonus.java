package day1_keep_all_folders.homework.homeworkFeb15;

import java.util.Scanner;

public class sales_and_bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you sell? ");
        double sales = input.nextDouble();
        double bonuse = 0;
                
        if(sales<10_000){
            System.out.println("You don't get any bonus");
        }
        if(sales>=10_000&&sales<15_000){
            System.out.println("You get a bonus of 5000");
            bonuse+=5_000;
        }

        
        if(sales>=15_000) {
            System.out.println("You get a bonus of 7000");
            bonuse+=7_000;
        }

        System.out.println("bonuse = " + bonuse);
        }
        
    }

