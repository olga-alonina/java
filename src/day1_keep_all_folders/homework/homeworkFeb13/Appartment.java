package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class Appartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          /* System.out.println("please enter your address");
        String address = input.nextLine();
            System.out.println("Your address " + address);

            System.out.println("please enter name of owner");
        String nameOfOwner = input.nextLine();
            System.out.println("Owner of this appartment is " + nameOfOwner);*/

            System.out.println("please enter number of units");
        int numberOfUnit = input.nextInt();
            System.out.println("Appartment has " + numberOfUnit);/*

            System.out.println("please enter average size of each unit");
        int averege = input.nextInt();
            System.out.println("Averege is " + averege);*/

            System.out.println("please enter monthly rent amount");
        double monthlyRent = input.nextDouble();
            System.out.println("Monthly rent is " + monthlyRent);

           /* System.out.println("number of washers and driers");
        int numOfWaD = input.nextInt();
            System.out.println("number of washers and driers " + numOfWaD);

            System.out.println("Could we have a pets?");
        boolean allowPets =input.nextBoolean();
            System.out.println("Could we have a pets? " + allowPets);

            System.out.println("Do you have pool?");
        boolean has_a_pool =input.nextBoolean();
            System.out.println("Do you have pool? " + has_a_pool);

            System.out.println("length of lease");
        input.nextLine();
        String length_of_lease = input.nextLine();
            System.out.println("Length of lease is " + length_of_lease);*/

            System.out.println("total number of residents in building");
        int res_in_bilding = input.nextInt();
            System.out.println("How many residents in building " + res_in_bilding);
            /*

            System.out.println("phone number of owner");
        input.nextLine();
        String owner_phone = input.nextLine();
            System.out.println("Phone number of owner is" + owner_phone);

            System.out.println("Is near a gas station?");
        boolean nearGasStation =input.nextBoolean();
            System.out.println("Do you have gas station near by? " + nearGasStation);*/

            System.out.println("number of floor");
        int numberOfFloors = input.nextInt();
            System.out.println("How many floors in building " + numberOfFloors);/*

            System.out.println(" Has a basement?");
        boolean hasBasement =input.nextBoolean();
            System.out.println("Do you have a basement? " + hasBasement);

            System.out.println(" Has available units for rent?");
        boolean availibleUnits =input.nextBoolean();
            System.out.println("Do you have available units for rent? " + availibleUnits);

            System.out.println(" Has air conditioning?");
        boolean hasAirconditioning =input.nextBoolean();
            System.out.println("Do you have air conditioning? " + hasAirconditioning);*/

            System.out.println("number of parking spaces");
        int numberOfParkingSpaces= input.nextInt();
            System.out.println("How many  parking spaces? " + numberOfParkingSpaces);/*

            System.out.println(" Has wheel chair access?");
        boolean has_wheel_chair_access =input.nextBoolean();
            System.out.println("Do you have wheel chair access? " + has_wheel_chair_access);

            System.out.println("number of review stars");
        int number_of_review_stars= input.nextInt();
            System.out.println("How many review stars? " + number_of_review_stars);*/

        double discount_after3Years= input.nextDouble();
        discount_after3Years= monthlyRent * 0.9;
            System.out.println("After 3 years rent will be: " + discount_after3Years);

        double discount_after6Years= monthlyRent * 0.8;
        discount_after6Years = input.nextDouble();
            System.out.println("After 6 years rent will be: " + discount_after6Years);

        double resPerUnits = res_in_bilding/numberOfUnit;
        resPerUnits = input.nextDouble();
            System.out.println("Average number of residents per unit: " + resPerUnits);

        double parkSlotsPerUnits = numberOfParkingSpaces/numberOfUnit;
        parkSlotsPerUnits = input.nextDouble();
            System.out.println("Average number of parking spots per unit: " + parkSlotsPerUnits);

        double initsPerFloor = numberOfUnit/numberOfFloors;
        parkSlotsPerUnits = input.nextDouble();
            System.out.println("Average number parking spots per unit: " + parkSlotsPerUnits);



            }
}
