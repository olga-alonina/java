package day1_keep_all_folders.homework.HomeworkFeb26;

import java.util.Scanner;

public class title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your name including titles");
        String name = input.nextLine();
        name = name.toLowerCase();
        String result1 = " ";
        String result2=" ";

        if (name.startsWith("mr ") || (name.startsWith("Mister "))) {
            result1 = "Hello Sir";
        }
        else if (name.startsWith("ms ") || name.startsWith("Miss ") || name.startsWith("Madam ")) {
            result1 = "Hello Ma'am";
        }
        else if (name.startsWith("dr ") || name.startsWith("Doctor")) {
            result1 = "Hello Doctor";
        }
        if (name.endsWith(" sr")) {
            result2 = "Nice to meet you Senior";
        }
        else if (name.endsWith(" jr")) {
            result2 = "Nice to meet you Junior";
        }
        System.out.println(result1+" "+result2);

    }
}
