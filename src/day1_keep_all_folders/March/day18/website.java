package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter website:");
        String website = input.nextLine();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");
        if (validEnd && validStart) {
            System.out.println("website " + website + "is valid");
        if(validEnd&&validStart) {
            System.out.println(website + " is valid website");
        }else {
            if(!validStart) {
                System.out.println("website needs to start with www");
            }
            if (!validEnd){
                System.out.println("website need to end with .com or edu or .net or .gov");
            }
        }

        }
    }


}
