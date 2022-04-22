package day1_keep_all_folders.March.day17_poolsOFJava;

public class StringMetods {
    public static void main(String[] args) {
        String name = "olga";
        System.out.println(name.equals("olga"));
        System.out.println(name.equals("Dog"));
        System.out.println(name.equals("Olga"));
        System.out.println(name.equalsIgnoreCase("Olga"));
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a.equals("hello"));
        System.out.println(a.equals("java"));
        System.out.println(name.length());
        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));
    }
}
