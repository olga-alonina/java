package day1_keep_all_folders.homework.homeworkMarch5;

public class Java_in_numbers {
    //Ex:
    //Input:
    //“java”
    //Output:
    //106 97 118 97
    public static void main(String[] args) {
        String word ="Java";
        for (int i=0; i<word.length();i++){
            System.out.print((int)word.charAt(i)+" ");
        }
    }
}

