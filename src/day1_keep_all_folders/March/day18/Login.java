package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String username = input.next();
        username = username.toLowerCase();
        System.out.println(username);
        System.out.println("please enter password: ");
        String password = input.next();
        int a;
        a = password.length();
        if (password.length() > 8 && password.equals("jamesbond")) {
            System.out.println("logged in with " + username);
        } else {
            System.out.println("invalid password");
        }

    }
}
