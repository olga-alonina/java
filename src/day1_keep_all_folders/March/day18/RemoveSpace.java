package day1_keep_all_folders.March.day18;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "         Satarday          ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim();
        System.out.println(s);
        System.out.println(s.length());
        String str = "      java is fun    ";
        System.out.println(str.startsWith("java"));//F
        //System.out.println((str.removeSpaceWithMetods()));
        str = str.trim();
        System.out.println(str.startsWith("java"));
    }
}
