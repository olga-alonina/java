package day1_keep_all_folders.February.day13_scanner;

public class Price_ana_Prime {
    public static void main(String[] args) {
        double price = 15.99;
        boolean hasPrime = false;

        if (hasPrime) {

            System.out.println("Eligible for 2 day shipping");

        } else {

            // here when hasPrime is false

            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
                price += 3.99; // price = price + 3.99;
            }

        }
    }}
