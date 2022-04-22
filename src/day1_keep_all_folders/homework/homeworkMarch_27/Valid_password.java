package day1_keep_all_folders.homework.homeworkMarch_27;

import java.util.Scanner;

public class Valid_password {
    public static void main(String[] args) {
        /*	Requirements:
		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number*/
        //Must have one of the follow special characters:    ! @ # $ % ^ & *
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
        String specCharacter = "!@#$%^&*";
        char[] appart = specCharacter.toCharArray();

        int countUC = 0;
        int countLC = 0;
        int countN = 0;
        int specChar = 0;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    countUC++;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    countLC++;
                } else if (Character.isDigit(password.charAt(i))) {
                    countN++;
                }
                char[] a = password.toCharArray();
                for (int j = 0; j < password.length(); j++) {
                    for (char each : appart) {
                        if (each == a[j]) {
                            specChar++;
                        }
                    }
                }
            }
        }
        if (countLC >= 1 && countN >= 1 && countUC >= 1 && specChar >= 1) {
            System.out.println("Your password is valid");
        } else if (password.length() < 8) {
            System.out.println("your password must have at least 8 characters");
        } else if (countUC < 1) {
            System.out.println("Add upper case character in the password");
        } else if (countLC < 1) {
            System.out.println("Add lower case character in the password");
        } else if (countN < 1) {
            System.out.println("Add number in the password");
        } else if (specChar < 1) {
            System.out.println("Add special character in the password");
        }
    }
}

