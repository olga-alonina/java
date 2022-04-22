package day1_keep_all_folders.March.March20_day33;

import java.util.Scanner;

public class greeting {
    public static void hello(String name) {
        System.out.println(" Hello " + name + ", how are you?");
    }

    public static void main(String[] args) {
        hello("Olga");
        hello("Anna");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        hello(name);
    }

}

