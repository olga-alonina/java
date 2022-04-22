package day1_keep_all_folders.March.March23_day34;

public class MetodsWithOther {
    public static String dayInWords(int day) {
        String strDay = "";
        switch (day) {
            case 1:
                strDay = "Monday";
                break;
            case 2:
                strDay = "Tuesday";
                break;
            case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Satarday";
                break;
            case 7:
                strDay = "Sunday";
                break;
            default:
                strDay = "Invalid number";
        }
        return strDay;
    }

    public static int firstEvenNumber(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]arr = {5,1,4,12,5};
        System.out.println(firstEvenNumber(arr));
    }
}