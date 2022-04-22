package day1_keep_all_folders.March.day22Loop;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepTalking = true;
        while (keepTalking){
            System.out.println("enter a message");
            String msg = input.nextLine();
            switch (msg){
                case"hello":
                    System.out.println("Hi");break;
                case "how are you":
                    System.out.println("I'm good");break;
                case "bye":
                    System.out.println("no,don't leave");
                default:
                    System.out.println("I don't know what you said");


            }
        }
    }
}
