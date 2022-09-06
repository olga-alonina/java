package day1_keep_all_folders.homework.homework_April_23.A;

public class First {
    public int a;
    protected int b;
    int c;
    private int d;
    public static int e;
    public void met(){
        b=6;        a=5;

        c=7;
        d=8;
        e=9;
    }

    public static void main(String[] args) {
        First obj = new First();
        obj.met();
        System.out.println( obj.a );
        System.out.println( obj.b );
        System.out.println( obj.c );
        System.out.println( obj.d );
        System.out.println( e );

    }
}

