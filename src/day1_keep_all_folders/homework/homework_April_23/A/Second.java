package day1_keep_all_folders.homework.homework_April_23.A;

public class Second {
    public static void main(String[] args) {
        First obj = new First();
        obj.met();
        System.out.println( obj.a );
        System.out.println( obj.b );
        System.out.println( obj.c );
      //  System.out.println( obj.d );//private
        System.out.println( First.e );
    }
}
