package day1_keep_all_folders.homework.homeworkMarch_27;

import java.util.Scanner;

public class HTML_Generator {
    /*    Input: div^2
 Output:     <div></div> <div></div>
*/
    public static String HTML_Generate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sen = input.nextLine();
        sen = sen.replace("^", " ");
        String[] arr = sen.split(" ");
        String res = "";
        String info = String.valueOf(arr[0]);
        int times = Integer.parseInt(arr[1]);
        for (int i = 1; i <= times; i++) {
            res += ("<" + info + "></" + info + ">");
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(HTML_Generate());
    }
}

