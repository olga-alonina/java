package Team_task.interviewPrep.mixMay;

public class arrayFront9 {
    /*Given an array of ints, return true if
    one of the first 4 elements in the array is a 9.
     The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false*/
    public static boolean arrayFront9(int[] nums) {
        boolean arrayFront9 = false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length < 4) {
                if (nums[i] == 9) {
                    arrayFront9 = true;
                }
            } else {
                if (nums[i] == 9) {
                    count++;
                    if (count <= 1 && i < 4) {
                        arrayFront9 = true;
                    }else if( i >= 4){
                        arrayFront9 = false;
                    }
                }
            }
        }

        return arrayFront9;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 9, 3, 4};
        int[] nums1 = {9, 2, 3};
        int[] nums2 = {1, 2, 3, 4, 5};
       // System.out.println( arrayFront9( nums ) );
        System.out.println( arrayFront9( nums1 ) );
        System.out.println( arrayFront9( nums2 ) );
    }

}
