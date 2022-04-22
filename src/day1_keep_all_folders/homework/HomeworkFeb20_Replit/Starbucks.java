package day1_keep_all_folders.homework.HomeworkFeb20_Replit;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your genre:");
        String genre = input.next();
        int page_length, sequels, countries;
        double profit;

        switch (genre) {

            case "Fantasy":
                page_length = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                page_length = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                page_length = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
            case "Short Story":
                page_length = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
        }
    }
}