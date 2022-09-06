package day1_keep_all_folders.May.May28_day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Salary {
    /*
    Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

    Use the created map to find the following:

        1.1 who has the maximum salary?
        1.2 who has the minimum salary?
        1.3 how many employees has the salary between 120k ~ 150K?
        1.4 display the names of the employees who are making less than 118k?
        1.5 increase the salary of each employee by 10K
     */
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put( "James", 70_000.0 );
        map.put( "Jane", 30_000.0 );
        map.put( "Ana", 140_000.15 );
        map.put( "Jorge", 42_452.23 );
        map.put( "Elza", 123_131.1 );
        map.put( "Peter", 231_234.0 );
        String nameLargest = "";
        String nameSmallest = "";
        double maxSalary = 0;
        double minSalary = Double.MAX_VALUE;
        for(String key: map.keySet()){
            double value = map.get( key );
            if(value>maxSalary){
                nameLargest = key;
                maxSalary  =value;

            } if(value<minSalary){
                nameSmallest = key;
                minSalary  =value;
            }
        }
        System.out.println( "minSalary = " + minSalary+ " nameSmallest = " + nameSmallest );
        System.out.println( "maxSalary = " + maxSalary + " nameLargest = " + nameLargest );

    }
}
