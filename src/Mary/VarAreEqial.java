package Mary;

import java.util.Scanner;

public class VarAreEqial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter letter:");
        String newLetter = input.nextLine();

        switch (newLetter) {

            case "A is strong":
                System.out.println("result " + newLetter);
                break;
            case "B is strong":
                System.out.println("result " + newLetter);
                break;
            default:
                System.out.println("invalid letter");
        }
        System.out.print("****************");


    }
    }