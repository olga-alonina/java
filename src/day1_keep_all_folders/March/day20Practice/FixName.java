package day1_keep_all_folders.March.day20Practice;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first name");
        String FN = input.nextLine().trim().toLowerCase();
        System.out.println("please enter last name");
        String LN = input.nextLine().trim().toLowerCase();


        String fix1FN = FN.substring(0,1).toUpperCase();
        fix1FN+=FN.substring(1);

        String fix1LN = LN.substring(0,1).toUpperCase();
        fix1LN+=LN.substring(1);

        System.out.println(fix1FN+" "+fix1LN);


    }
}
