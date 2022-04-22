package day1_keep_all_folders.March.March26_day36;

public class Type_Promotion {
    public static void use(float f) {
        System.out.println("calling float method");
    }

    public static void use(double d) {
        System.out.println("calling double method");
    }

    public static void use(long l) {
        System.out.println("calling long method");
    }

    public static void main(String[] args) {
        use(3);
        use(3.5);
        use(1.2f);
        use(3l);
        use(3f);

    }
}
