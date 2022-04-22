package day1_keep_all_folders.homework.Homework_April_9;

public class Car {
    String model, color;
    double fuel_level;
    int year;
    @Override
    public String toString() {
        return "Model\t\t" + model +
                "\ncolor\t\t" + color +
                "\nyear\t\t" + year +
                "\nfuel_level\t" + fuel_level+"%";
    }

    public void drive() {
        System.out.println( "Driving " + model );
        fuel_level -= 5;
        System.out.println( "fuel_level "+fuel_level+"%" );
    }

    public void fillTank() {
        System.out.println( "filling tank" );
        fuel_level = 100;
        System.out.println( "fuel_level "+fuel_level+"%" );
    }

    public boolean isLow() {
        boolean gasLow = fuel_level < 25;
        return gasLow;
    }
}

