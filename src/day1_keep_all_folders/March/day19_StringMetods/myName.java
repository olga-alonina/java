package day1_keep_all_folders.March.day19_StringMetods;

public class myName {
    public static void main(String[] args) {
        String name = "olga";
        name = name.toUpperCase();
        System.out.println("Your name is :" + name);
        int s = name.length();//number letters
        System.out.println("Your name has: " + s + " character");

        System.out.println("" + name.charAt(0) + "\n" + name.charAt(1) + "\n" + name.charAt(2) + "\n" + name.charAt(3));
    }
}

