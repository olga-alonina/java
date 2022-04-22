package day1_keep_all_folders.homework.Homework_April_12;

import day1_keep_all_folders.homework.Homework_April_11.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class UseEmployee2 {
    public static String Test() {
        System.out.println( "*******SDET or Developer *******" );
        Employee unit4 = new Employee( "Olga", 123, "Sdet", 125_000 );
        Employee unit5 = new Employee( "Anna", 124, "Ceo", 250_000 );
        Employee unit6 = new Employee( "Alex", 125, "Developer", 200_000 );
        Employee unit7 = new Employee( "Daniel", 126, "Sdet", 150_000 );
        Employee unit8 = new Employee( "Tom", 127, "Designer", 100_000 );

        ArrayList<Employee> list2 = new ArrayList<>(Arrays.asList( unit4, unit5, unit6, unit7, unit8 ) );

        String res1 = "", res2 = "", res3 = "";
        double maximum = list2.get( 0 ).salary;
        for (Employee worker : list2) {
            if (worker.job_title.equals( "Sdet" ) || worker.job_title.equals( "Developer" )) {
                res1 += worker.job_title+" is " + worker.name + "\n";
            }
            if (worker.salary > 100_000) {
                res2 += "Salary over 100_000 has " + worker.name + " with " + worker.salary + "\n";
            }
            if (worker.salary > maximum) {
                maximum = worker.salary;
            }

        }
        res3 += "maximum salary " + maximum;
        for (Employee each : list2) {
            if (each.salary == maximum) {
                res3 += " from " + each.name;
            }
        }
        return res1 + "\n" + res2 + "\n" + res3;
    }

    public static void main(String[] args) {
        System.out.println( Test() );
    }
}


