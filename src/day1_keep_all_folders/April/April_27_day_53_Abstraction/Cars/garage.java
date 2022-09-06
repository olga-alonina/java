package day1_keep_all_folders.April.April_27_day_53_Abstraction.Cars;

public class garage {
    public static void main(String[] args) {
        //     Car obj2 = new Car() ;//abstract
        Toyota obj = new Toyota();
        obj.start();
        System.out.println( "**********" );
        Honda obj1 = new Honda();
        obj1.start();
        System.out.println( "*************" );
        //  ElectricCar obj4 = new ElectricCar() ;//abstract (could not create class)
        Tesla onj = new Tesla();
        onj.start();
        onj.charge();

    }
}
