package AH.June6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3_ListOfMaps_methods {
    public static void main(String[] args) {
        List<Map<String, String>> employees = new ArrayList<>();
        Map<String, String> emplData = new HashMap<>();
        emplData.put( "EmpId", "123" );
        emplData.put( "EmpName", "Mike" );
        emplData.put( "JobTitle", "SDET" );
        emplData.put( "Salary", "120000" );
        employees.add( emplData );

        Map<String, String> emplData1 = new HashMap<>();
        emplData1.put( "EmpId", "124" );
        emplData1.put( "EmpName", "Olga" );
        emplData1.put( "JobTitle", "SDET" );
        emplData1.put( "Salary", "110000" );
        employees.add( emplData1 );

        Map<String, String> emplData2 = new HashMap<>();
        emplData2.put( "EmpId", "125" );
        emplData2.put( "EmpName", "Alex" );
        emplData2.put( "JobTitle", "Dev" );
        emplData2.put( "Salary", "220000" );
        employees.add( emplData2 );

        System.out.println( "employees = " + employees );
        System.out.println( "employees first added = " + employees.get( 0 ) );
        System.out.println( "how many people inside = " + employees.size() );
        System.out.println( "number of data in first employee = " + employees.get( 0 ).size() );
        System.out.println( "name first employees  = " + employees.get( 0 ).get( "EmpName" ) );
        System.out.println("last employee salary"+employees.get(employees.size()-1).get("Salary"));

        int totalSalary = 0;
        for (Map<String, String> each : employees) {
            totalSalary += Integer.parseInt( each.get( "Salary" ) );
        }
        System.out.println( "totalSalary = " + totalSalary );
    }
}
