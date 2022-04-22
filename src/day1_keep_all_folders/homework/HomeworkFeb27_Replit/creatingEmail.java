package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

//If the information provided is valid, you will take the first 4 characters of first string and combine them
// with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and
// print the final string as your created email. The final email should be in all lowercase.
// input: JamesBond Secret  //output: jameret@cybertek.com
public class creatingEmail {
    public static void main(String[] args) {
        System.out.println("please enter 2 strings: ");
        Scanner input = new Scanner(System.in);
        String oneS = input.nextLine();
        String secondS = input.nextLine();
        String finalEmail;

        int num1 = oneS.length();
        int num2 = secondS.length();
        if (num1 >= 6 && num2 >= 6) {
            String firstPart = oneS.substring(0, 4);
            //System.out.println(firstPart);
            String secondPart = secondS.substring(num1 - 6);
            // System.out.println("secondPart = " + secondPart);
           finalEmail = firstPart+secondPart;
           finalEmail = finalEmail.toLowerCase();
           System.out.println(finalEmail+"@cybertek.com");
        } else {
            System.out.println("Invalid data");

        }
    }
}
