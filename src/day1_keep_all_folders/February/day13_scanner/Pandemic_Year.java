package day1_keep_all_folders.February.day13_scanner;

import java.util.Scanner;

public class Pandemic_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if (year >= 1346 && year <= 1353) {
            System.out.println("The Black Death");
        } else if (year >= 1665 && year <= 1666) {
            System.out.println("Great Plague of London");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println("Russian plague");
        } else if (year >= 1889 && year <= 1890) {
            System.out.println("Flu pandemic");
        } else if (year >= 1918 && year <= 1920) {
            System.out.println("Spanish Flu");
        } else if (year >= 2009 && year <= 2010) {
            System.out.println("H1N1 Swine Flu pandemic");
        } else if (year >= 2014 && year <= 2016) {
            System.out.println("West African Ebola epidemic");
        } else if (year >= 2020 && year <= 2022) {
            System.out.println("COVID-19");
        } else if (year < 0) {
            System.out.println("Incorrect number");
        } else {
            System.out.println("It was healthy year");
        }


        //        Any year not in those ranges: No Pandemic
    }
}
