package day1_keep_all_folders.homework.homework_April_23.B;


import day1_keep_all_folders.homework.homework_April_23.A.First;

public class Third extends First {
    public static void main(String[] args) {
        First obj = new First();
        obj.met();
        System.out.println( obj.a );
        //System.out.println( obj.b );
        //  System.out.println( obj.c );
        //   System.out.println( obj.d );
        System.out.println( First.e );
        Third obj2 = new Third();
        System.out.println( obj2.b );
    }
}
