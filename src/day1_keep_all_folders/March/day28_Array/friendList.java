package day1_keep_all_folders.March.day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class friendList {
    public static void main(String[] args) {
        //  Make an array of your friends names
        //        asking how many friends do you have
        //        then ask for each friend's name one at a time, store all the names into an array
        //String[] name = {"Olga", "James", "Alex", "Amanda"};
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have");

        int numbOfFriends = input.nextInt();

        String[] name = new String[numbOfFriends];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter your friend's name");
            name[i] = input.next();
                   }
        System.out.println(Arrays.toString(name));

    }
}
