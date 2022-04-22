package day1_keep_all_folders.March.day28_Array;

public class max_and_Min {
    public static void main(String[] args) {
        //  declare and assign an array
                //        500, 120, -80, 90, 250, - 10
               //        find the biggest number in the array
                //        find the smallest number in the array
        int[] num = {500, 120, -80, 90, 250, 600};
        int max = num[0];
        int min = num[0];
         for(int i = 0; i < num.length; i++) {

            if(num[i]>max){
                max = num[i];
            }
            if (num[i]<min) {
                min= num[i];
            }
        }System.out.println("max = "+ max);
        System.out.println("min="+min);

    }
}
