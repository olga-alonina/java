package Team_task.notADDEDtoTheGroup;

public class array667 {
    /*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
 Also count instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1*/
    public static int array667(int[] nums) {
        int howOften = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    howOften++;

                }
            }
        }
        return howOften;
    }

    public static void main(String[] args) {
        int[] x = {6, 6, 2};
        int[] x1 = {6, 6, 2, 6};
        int[] x2 ={6, 7, 2, 6};
        System.out.println(array667( x ));
        System.out.println(array667( x1 ));
        System.out.println(array667( x2 ));
    }

}
