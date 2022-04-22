package day1_keep_all_folders.homework.Homework_April_9;

public class UseCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Honda";
        car1.color = "grey";
        car1.year = 2012;
        car1.fuel_level = 65;
        System.out.println( car1 );
        car1.drive();
        car1.drive();
        car1.drive();
        car1.fillTank();
        car1.drive();
        car1.drive();
        car1.drive();
        car1.isLow();

    }
}
