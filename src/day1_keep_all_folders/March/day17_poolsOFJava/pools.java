package day1_keep_all_folders.March.day17_poolsOFJava;

public class pools {
    public static void main(String[] args) {
        String first = "java";
        String second = new String ("java");
        System.out.println(first==second);
        String third = "java";
        System.out.println(first==third);
        String fourth="Java";
        System.out.println(first==fourth);
        String fifth = new String("java");
        System.out.println(second == fifth);


    }
}
