package day1_keep_all_folders.homework.homeworkFeb16;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many oxygen do you have now?");
        int oxygenLevel = input.nextInt();
        if (oxygenLevel >= 90){
            System.out.println("Your tank is full");
        }
        if (oxygenLevel>=80&&oxygenLevel<90){
            System.out.println("Still okay");
        }
        if (oxygenLevel>=70&&oxygenLevel<80){
            System.out.println("Don't go too far");
        }
        if (oxygenLevel>=60&&oxygenLevel<70){
            System.out.println("Start to head back");
        }
        if(oxygenLevel>=50&&oxygenLevel<60){
            System.out.println("Be careful now you at at 50%");
        }

}}
