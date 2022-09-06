package Team_task.Vesa.VesaPackMay5;

public class Divide_without {
    /* Numbers - Divide without / operator
     Write a method that can divide two numbers without using division operator*/
    public static int divide_without(int num, int num2) {
        int count = 0;
        for (int i = 0; i <= num; i++) {
            while (num > 0) {
                num-=num2;
                count++;
            }if(num2 ==0){
                System.out.println("invalide divider");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( divide_without( 15, 3 ) );
    }

}
