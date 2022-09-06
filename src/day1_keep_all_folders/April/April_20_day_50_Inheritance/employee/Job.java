package day1_keep_all_folders.April.April_20_day_50_Inheritance.employee;

public class Job {
    public static void main(String[] args) {
        Employee newst = new Employee();
        newst.name = "Olga";
        newst.is_Full_Time = true;
        newst.salary = 125_000;
        System.out.println( newst );
        System.out.println("*********");

        Tester newst1 = new Tester();
        newst1.name = "Anna";
        newst1.is_Full_Time = false;
        newst1.salary = 155_000;
        newst1.bug_Found = true;
        newst1.test();
        System.out.println( newst1 );
        System.out.println("**************");
        Developer newst2 = new Developer();
        newst2.name = "Alex";
        newst2.is_Full_Time = false;
        newst2.salary = 175_000;
        newst2.develop();
        System.out.println( newst2 );
    }
}
