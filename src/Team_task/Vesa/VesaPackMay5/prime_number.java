package Team_task.Vesa.VesaPackMay5;

public class prime_number {
    public static boolean prime(int num) {
        for (int i = 2; i < 10; i++) {
            if (num % i == 0) {
                if (num != i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( prime( 13 ) );
        System.out.println( prime( 6 ) );
        System.out.println(prime(17));
    }
}
