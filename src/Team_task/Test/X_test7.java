package Team_task.Test;

public class X_test7 {
    static int i;
    int j;

    public static void main(String[] args) throws Exception {
        X_test7 x1 = new X_test7();
        X_test7 x2 = new X_test7();

        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;

        System.out.println( "x1.i  = " + x1.i );
        System.out.println( "x1.j  = " + x1.j );
        System.out.println( "x2.i  = " + x2.i );
        System.out.println( "x2.j  = " + x2.j );
    }
}

