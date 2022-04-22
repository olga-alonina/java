package Mehmet.OH_1_12;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which room do they need carpet? ");
        String rooms = input.next();
        double unitPriceForCarpet = 3.92;
        double area = 0;
        double totalcost;

        switch (rooms) {
            case "Bedroom":
                System.out.println("Please write lenght: ");
                double lenght = input.nextDouble();
                System.out.println("Please write width: ");
                double width = input.nextDouble();
                area += lenght * width;
                break;
            case "Kitchen":
                System.out.println("Please write radius: ");
                double radius = input.nextDouble();
                area += radius;

                break;
            default:
                System.out.println("Invalid Room Type");
        }
        System.out.println("Please enter your adress:");
        input.nextLine();
        String adress = input.nextLine();
        totalcost = area * unitPriceForCarpet;
        System.out.println("Total cost for your carpet is " + totalcost +
                "\n and it will be delivery " + adress + " in one week");

    /*
                     Task : CarpetShop


                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 51.84 and it will be delivery
                            			 1300 Lamar St Houston TX 77010 in one week"*/
    }
}

