package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class SandwichBetweenBreads {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int bread1 = str.indexOf("bread");
        System.out.println("bread1 = " + bread1);

        int bread2 = str.lastIndexOf("bread");
        System.out.println("bread2 = " + bread2);

        if (bread1 >= 0 && bread2 >= 0 && bread1 != bread2) {
            str = str.substring(bread1, bread2);
            System.out.println("bread = " + str);

            if (str.contains("bread"))
                str = str.substring(5);
            System.out.println("bread2 = " + str);
            System.out.println(str);
        } else {
            System.out.println("nothing");
        }

    }
}

