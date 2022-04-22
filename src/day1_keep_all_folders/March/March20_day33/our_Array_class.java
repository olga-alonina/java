package day1_keep_all_folders.March.March20_day33;

public class our_Array_class {
    public static void firstElement(int[] nums) {
        System.out.println("First element = " + nums[0]);

    }

    public static void lastElement(int[] nums) {
        System.out.println("Last element = " + nums[nums.length - 1]);
    }

    public static void middleElement(int[] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("First middle element= " + nums[nums.length / 2 - 1]);
            System.out.println("Second middle elements= " + nums[nums.length / 2]);
        } else {
            System.out.println("Middle element= " + nums[nums.length / 2]);
        }
    }

    public static void printArray(int[] nums) {
        String result = "Start|=> ";
        for (int num : nums) {
            result += num+"=>";
        }   result += " | END";

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 5, 25, 78, 55, 75, 5, 8, 6, 9};
        firstElement(nums);
        lastElement(nums);
        middleElement(nums);
        printArray(nums);
        printArray(new int[]{2,9,8,9,7});
    }
}
