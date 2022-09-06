package Team_task.Vesa.VesaPackMay5;

public class finra {
    public static void finra(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print( " FINRA " );
            } else if (i % 3 == 0) {
                System.out.print( " FIN " );
            } else if (i % 5 == 0) {
                System.out.print( " RA " );
            } else {
                System.out.print( " " + i + " " );
            }

        }
    }

    public static void main(String[] args) {
        finra( 1, 30 );

    }
}
