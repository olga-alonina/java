package day1_keep_all_folders.March.day20Practice;

import java.util.Scanner;

public class moveFirstWord {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String senten = input.nextLine().trim();
    int space = senten.indexOf(' ');
    String firstWord = senten.substring(0,space);
    String result = senten.substring(space+1)+" "+firstWord;
        System.out.println(result);


    //[Move first word]
        //        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        //        Ex:
        //        Input: Java is a fun language Output: is a fun language Java
        //        Hint: Use indexOf and substring

}}
