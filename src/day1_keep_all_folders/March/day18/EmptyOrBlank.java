package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class EmptyOrBlank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter message");
        String str = "last example";
        System.out.println(str.isEmpty());//false

        str = "";
        System.out.println(str.isEmpty());//true

        String s = " ";
        System.out.println(s.isEmpty());//false
/*if(s.length()==0){
    System.out.println("empty");*/
        System.out.println("s is blank"+s.isBlank());

        String s2 = "              ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
}
}
