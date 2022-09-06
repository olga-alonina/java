package day1_keep_all_folders.April.April_23_day_51_inheritance.access.b;

import day1_keep_all_folders.April.April_23_day_51_inheritance.access.a.First;

public class Four extends First {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println( obj.one );
//        System.out.println( obj.two );
//        System.out.println( obj.three );
//        System.out.println( obj.four );
        Four obj2 = new Four();
        System.out.println( obj2.one );//public
        System.out.println( obj2.two );//protected
//        System.out.println( obj2.three );
//        System.out.println( obj2.four );
    }
}
