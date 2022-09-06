package Team_task.Vesa.VesaPackMay19;

public class Maximum_Minimum_Array {
    /*Write a method that can find the maximum number from an int Array
    Write a method that can find the maximum number from an int Array*/
    public static void maximum_Minimum_Array(int[] arr) {
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int each : arr) {
            if (each > maxNumber) {
                maxNumber = each;
            }
            if (each < minNumber) {
                minNumber = each;
            }
        }
        System.out.println( "minNumber " + minNumber + "\nmaxNumber " + maxNumber );
    }public static void maximum_Minimum_Array2(int[] arr){

    }

    public static void main(String[] args) {
        int[] arr = {6, 89, 5, 6, 7, 4, 5, 6, 7};
        maximum_Minimum_Array( arr );
    }

}
