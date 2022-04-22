package day1_keep_all_folders.February.day7_unary_operator;

public class ParkingLot {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("2 cars drive into parking lot");
        cars= cars+2;
        System.out.println("cars = " + cars);
        System.out.println("2 more cars drive into parking lot");
        //aproach 2
        cars++;
        cars++;
        System.out.println(cars);
        
        System.out.println("5 cars left");
        cars = cars-5;
        System.out.println("cars = " + cars);
        

    }
    }
