package day1_keep_all_folders.March.day24_Different_Loop;

public class Java_in_letters {
    public static void main(String[] args) {
        //Input:
        //“java”
        //Output:
        //106 97 118 9
        String word ="Java";
        for (int i=0; i<word.length();i++){
            System.out.print((int)word.charAt(i)+" ");
        }
    }
}
