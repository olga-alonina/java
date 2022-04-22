package Mary;

import java.util.Scanner;

public class wow {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        String result;
        if (number>=10){
            result = "Wow";
        }
        else {
            result = "Oh well";
        }
        System.out.println("Long version:" + result);
        System.out.println("***************");
        String result2 = (number>=10)?"Wow":"Oh well";

        System.out.println("Short version:" + result2);
    }}
