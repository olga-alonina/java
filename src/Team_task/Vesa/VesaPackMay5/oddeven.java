package Team_task.Vesa.VesaPackMay5;

public class oddeven {
    /*Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"*/
    public static String oddeven(int num) {
        String str = "";
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddeven(5));
        System.out.println(oddeven(6));
    }
}
