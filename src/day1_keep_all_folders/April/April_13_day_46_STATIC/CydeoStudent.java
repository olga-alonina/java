package day1_keep_all_folders.April.April_13_day_46_STATIC;

import java.util.Arrays;

public class CydeoStudent {
    String name;
    int group_Number;
    public  static int batch_Number;
    public  static String[] instructors;
    public static String school_Name;

    static {
        batch_Number = 26;
        instructors = new String[]{"Nadir", "Mehmet", "Austin", "Ausun", "Saim"};
        school_Name = "Cydeo";
    }

    public CydeoStudent(String name, int group_Number) {
        this.name = name;
        this.group_Number = group_Number;
    }

    public static void print_Info() {
        System.out.println( "school name = " + school_Name );
        System.out.println( "batch number = " + batch_Number );
        System.out.println( "instructors = " + Arrays.asList(instructors ));

    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", group_Number=" + group_Number +
                '}';
    }

}
