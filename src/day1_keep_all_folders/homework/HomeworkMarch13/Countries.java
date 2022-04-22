package day1_keep_all_folders.homework.HomeworkMarch13;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras",
                "Indonesia", "United States"};
        //fisrt adn last char each country

        String[] initials = new String[countries.length];
        for (int i = 0; i < countries.length; i++) {
            initials[i] = "" + countries[i].charAt(0) + countries[i].charAt(countries[i].length() - 1);
            System.out.println(countries[i] + "'s initials = " + initials[i]);
        }
        System.out.println("*********************");
        //last letter a
        String contryA = " ";
        for (int k = 0; k < countries.length; k++) {
            char c = countries[k].charAt(countries[k].length() - 1);
            if (c == 'a') {
                contryA += " " + countries[k];
            }
        }
        System.out.println("contryA = " + contryA);
        System.out.println("*********************");

        String[] FindCountry = new String[countries.length];
        Scanner input = new Scanner(System.in);
        System.out.println("What country do you wanna find?");
        String country = input.nextLine();
        boolean has_country = false;
        for (String findCountry : countries) {

            if (findCountry.equalsIgnoreCase(country)) {
                has_country = true;

            }
        }
        System.out.println("country " + country + " was founded");
    }
}


