package day1_keep_all_folders.March.March26_day36;

public class Array_Index_Of {
    public static int index_Of(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }


    public static String index_Of_All(int[] nums, int element) {
        String all = "";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                all += i+" ";
            }
        }
        return all;
    }


    public static void main(String[] args) {
        System.out.println(index_Of(new int[]{2, 5, 2, 2, 5, 2, 2, 5, 2}, 2));
        System.out.println(index_Of_All(new int[]{2, 5, 2, 2, 5, 2, 2, 5, 2}, 2));
        String[] words = {"java", "apple", "water", "hello"};
        System.out.println(indexOf(words, "hello"));

    }

    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }
}

