package day1_keep_all_folders.March.day19_StringMetods;

public class Metod3 {
    public static void main(String[] args){
        String word = "definition";
    //                 0123456789
        System.out.println("first i is " +word.indexOf('i'));
        System.out.println("last i is " +word.lastIndexOf('i'));

        System.out.println("second i is "+word.indexOf('i',4));
        System.out.println("third i is "+word.indexOf('i',6));
}}
