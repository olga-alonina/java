package AH.April4;

public class Check_Six {
    public static boolean check_Six(int[] arr) {
        boolean appearSix = false;
        int first = arr[0];
        int last = arr[arr.length - 1];
        if (first == 6 || last == 6) {
            appearSix = true;
        }
        return (appearSix);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 6, 6, 6, 1};
        System.out.println( check_Six( arr ) );
    }
}
