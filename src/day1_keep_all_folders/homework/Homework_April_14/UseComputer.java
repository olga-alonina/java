package day1_keep_all_folders.homework.Homework_April_14;

public class UseComputer {
    public static void main(String[] args) {
        Computer[] list1 = {new Computer( "Asus", "grey", 1000 ),
                new Computer( "Lenovo", "black", 1200 )};
        for (Computer item : list1) {
            System.out.println( "item.brand = " + item.brand );
            System.out.println( item.color );
            System.out.println( item.price );

        }
        System.out.println( Computer.hasBattery );
        System.out.println( Computer.hasScreen );
        System.out.println( Computer.hasMemory );
    }
}
