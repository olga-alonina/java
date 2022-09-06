package Extra_Tasks;

public class QCB_arrayCount9 {
    /*
Given an array of ints, return the number of 9's in the array.


QCB_arrayCount9([1, 2, 9]) → 1
QCB_arrayCount9([1, 9, 9]) → 2
QCB_arrayCount9([1, 9, 9, 3, 9]) → 3*/
    public static int arrayCount9(int[] nums) {
        int arrayCount9 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==9){
                arrayCount9++;
            }
        }
return arrayCount9;
    }

    public static void main(String[] args) {
  int[]nums = {1, 2, 9};
        int[]nums1 = {1, 9, 9};
        int[]nums2 = {1, 9, 9, 3, 9 };
        System.out.println( arrayCount9( nums ) );
        System.out.println( arrayCount9( nums1 ) );
        System.out.println( arrayCount9( nums2 ) );
    }
}
