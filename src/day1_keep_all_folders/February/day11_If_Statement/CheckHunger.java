package day1_keep_all_folders.February.day11_If_Statement;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //boolean AreYouHungry = true;//hardcoded

        System.out.println("Are you hungry?");
        boolean AreYouHungry = input.nextBoolean();
        if(AreYouHungry) {
            System.out.println("You are hungry so I will get some food for you");
        }
        else {
            System.out.println("Great, then practice java");
        }
    }
}
