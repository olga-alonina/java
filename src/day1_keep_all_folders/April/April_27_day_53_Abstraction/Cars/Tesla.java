package day1_keep_all_folders.April.April_27_day_53_Abstraction.Cars;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println( "card in the car" );
        System.out.println("pressing button");
    }

    @Override
    public void charge() {
        System.out.println("charging tesla");

    }
}
