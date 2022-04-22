package Mehmet.OH_1_12;

import java.util.Scanner;

public class browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write your browser:");
        String browserName = input.next();
        System.out.println("Please write your operating system:");
        String operatingSystem = input.next();
        System.out.println("Browser is open now?");
        boolean isBrowserOpened = input.nextBoolean();

        switch (browserName) {
            case "chrome":
            case "chrome-headless":
            case "firefox-headless":
            case "remote-chrome":
            case "firefox":
                switch (operatingSystem) {
                    case "windows":
                    case "mac":
                        if (isBrowserOpened) {
                            System.out.println("Browser is already opened with " + browserName + "  in " + operatingSystem);
                        } else {
                            System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);
                        }
                        break;
                }break;

            case "ie":
            case "edge":
                switch (operatingSystem) {
                    case "windows":
                        if (isBrowserOpened) {
                            System.out.println("Browser is already opened with " + browserName + "  in " + operatingSystem);
                        } else {
                            System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);
                        }
                        break;
                    case "mac":
                        if (isBrowserOpened) {
                            System.out.println("Browser is already opened with " + browserName + "  in " + operatingSystem);
                        } else {
                            System.out.println("Your "+operatingSystem+" doesn't support "+browserName);
                        }
                        break;
                }break;

            case "safari":
                switch (operatingSystem) {
                    case "mac":
                        if (isBrowserOpened) {
                            System.out.println("Browser is already opened with " + browserName + "  in " + operatingSystem);
                        } else {
                            System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);
                        }
                        break;
                    case "windows":
                        if (isBrowserOpened) {
                            System.out.println("Browser is already opened with " + browserName + "  in " + operatingSystem);
                        } else {
                            System.out.println("Your "+operatingSystem+" doesn't support "+browserName);
                        }break;
                }break;
            default:
                System.out.println("Your browser and operating system are not in the list");


        }
    }
}
