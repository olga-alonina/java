package day1_keep_all_folders.March.March20_day33;

public class Car {
    public static void unlockCar() {
        System.out.println("Unlocking car");
    }

    public static void openTheDoor() {
        System.out.println("Opening the door");
    }

    public static void sitInTheCar() {
        System.out.println("Sitting in rhe car");
        System.out.println("Closing door");
    }

    public static void getReadyToGo() {
        System.out.println("Putting on seatbelt");
        System.out.println("Check the mirror");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }

    public static void startCar() {
        System.out.println("Starting car");
    }

    public static void driveAndGo() {
        System.out.println("Putting car into drive");
        System.out.println("Going forwards");
    }
public static void goInHurry(){
    unlockCar();
    sitInTheCar();
    startCar();
    driveAndGo();
}
    public static void main(String[] args) {
        unlockCar();
        openTheDoor();
        sitInTheCar();
        getReadyToGo();
        startCar();
        driveAndGo();
        System.out.println();

        goInHurry();
        System.out.println("hear police siren");
        getReadyToGo();
    }

}

