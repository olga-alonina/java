package day1_keep_all_folders.March.March27_day37;

import java.util.Scanner;

public class Parse_Int_Year {
    public static void main(String[] args) {
        String year = "2022";
        System.out.println("This year "+year);
        System.out.println("Next year will be "+(year+1));

        int numYear = Integer.parseInt("2022");
        System.out.println("This year "+numYear);
        System.out.println("Next year will be "+(numYear+1));

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?\nPlease answer in following format: I am ___ years old");
        String str = input.nextLine();
       String age1 = str.split(" ")[2];
       int age = Integer.parseInt(age1);

        System.out.println("In 5 years you will be "+(age+5));

    }
}
