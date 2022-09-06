package day1_keep_all_folders.April.April_16_day_47_Encapsulation;

import day1_keep_all_folders.April.April_13_day_46_STATIC.CydeoStudent;

public class School {
    public static void main(String[] args) {
        CydeoStudent emre = new CydeoStudent( "Emre",5 );
        System.out.println( emre );
        CydeoStudent.print_Info();
        emre.print_Info();
        System.out.println();
        System.out.println( CydeoStudent.instructors[0] );
    }
}
