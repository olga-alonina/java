package day1_keep_all_folders.March.March27_day37;

import java.util.Arrays;

public class Google_Search {
    public static void main(String[] args) {
        String res = "about 2.550.000.000 results (1.00 seconds)";
        String[] arr = res.split(" ");
        System.out.println(Arrays.toString(arr));
        String result = arr[1].replace(".", "");
        String time = arr[3].substring(1);

        System.out.println(result + " " + time);
        long resNumber = Long.parseLong(result);
        System.out.println(resNumber);
        double time_Numb = Double.parseDouble(time);
        if(resNumber>=0){
            System.out.println("test case passed - positive number");
        }
        if (time_Numb <= 2 && time_Numb >= 0) {
            System.out.println("test case passed -under 2 seconds");
        }

    }
}
