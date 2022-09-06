package day1_keep_all_folders.April.April_16_day_47_Encapsulation;

public class Access_In_Page {
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;

    public static void main(String[] args) {
        Access_Modifier obj = new Access_Modifier();
        System.out.println( obj.a );
        System.out.println( obj.b );
       // System.out.println( obj.c );

        System.out.println( Access_Modifier.x );
        System.out.println( Access_Modifier.y );
     //   System.out.println( Access_Modifier.z );
    }
}

