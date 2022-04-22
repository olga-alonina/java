package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters do we have?");
        String[][]book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();
        for (int i = 0; i <book.length ; i++) {
            System.out.println("Enter chapter"+ (i+1));
            String chapter = input.nextLine();
            String[]sentenses = chapter.split(". ");
            book[i] = sentenses;
            System.out.println(Arrays.deepToString(book));


        }

    }
}
