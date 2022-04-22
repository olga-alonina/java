package day1_keep_all_folders.February.day15_switch_statement;

import java.util.Scanner;

public class browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.next();
        System.out.println("Enter you URL");
        String url = input.next();

        switch (browser) {
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the Chrome ");
                System.out.println("Loading....");
                break;
            case "Safary":
                System.out.println("Opening " + url + " in the Safary ");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the Firefox ");
                break;
            default:
                System.out.println(browser+" is not valid browser");
        }
    }
}
