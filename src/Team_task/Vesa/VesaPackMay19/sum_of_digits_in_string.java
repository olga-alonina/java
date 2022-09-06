package Team_task.Vesa.VesaPackMay19;

public class sum_of_digits_in_string {
    /* Write a method that can return the sum of the digits in a string*/
    public static int sum_of_digits_in_string(String str) {
        int sum = 0;
        char[] newStr = str.toCharArray();
        for (char each : newStr) {
            if (Character.isDigit( each )) {
                sum += Integer.parseInt( "" + each );
            }else{
                continue;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( sum_of_digits_in_string( "12a3456" ) );
    }
}
