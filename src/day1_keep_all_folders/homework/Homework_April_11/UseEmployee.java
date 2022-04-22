package day1_keep_all_folders.homework.Homework_April_11;

public class UseEmployee {
    public static void main(String[] args) {
        Employee worker1 = new Employee( "Olga", "SDET" );
        worker1.goToMeeting();
        System.out.println( "worker1: " + worker1 );
        System.out.println( "*****" );
        Employee worker2 = new Employee( "Anna", 123, "Ceo", 125_000 );
        System.out.println( "worker2: " + worker2 );
        System.out.println( "*****" );
        Employee worker3 = new Employee( "Alex", 125, "developer", 200_000 );
        System.out.println( "worker3: " + worker3 );
    }
}
