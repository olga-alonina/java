package day1_keep_all_folders.homework.homeworkFeb19;

import java.util.Scanner;

public class Movie_Costs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much your film will cost?");
        double duration = input.nextDouble();

        if (duration <= 0) {
            System.out.println("Movies cannot be less than 0 minutes");
        }
        if(duration>4) {
            System.out.println("Movies cannot be more than 4 hours");
        }
        if (duration>=1&&duration<1.5){
            System.out.println("Cost will be 8.99");
            }
        if (duration>=1.5&&duration<2)
            System.out.println("Cost will be 10.50");

        if (duration>=2&&duration<2.5)
            System.out.println("Cost will be 12.99");
        if (duration>=2.5&&duration<3)
            System.out.println("Cost will be 14.50");
        if (duration>=3&&duration<=4)
            System.out.println("Cost will be 15.99");


    }
}
