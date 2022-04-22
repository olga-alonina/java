package day1_keep_all_folders.homework.HomeworkFeb26;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your address");
        String address = input.nextLine();
        address = address.toUpperCase();
        String result = " ";


        if (address.startsWith("500")) {
            result = "house on the right side";
        } else if (address.startsWith("600")) {
            result = "house on the left side";
        }
        if (address.contains("AVE")) {
            result = result + "\nhouse on avenue";
        } else if (address.contains("DR")) {
            result = result + " \nhouse on drive";
        } else if (address.contains("LANE")) {
            result = result + " \nhouse on lane";
        }
        System.out.println(address + "\n" + result);

    }}