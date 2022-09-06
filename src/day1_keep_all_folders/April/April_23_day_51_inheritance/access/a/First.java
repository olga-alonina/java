package day1_keep_all_folders.April.April_23_day_51_inheritance.access.a;

public class First {
    public int one = 1;
    protected int two = 2;
    int three = 3;

    private int four = 4;

    public static void main(String[] args) {
        First obj = new First();
        System.out.println( obj.one );
        System.out.println( obj.two );
        System.out.println( obj.three );
        System.out.println( obj.four );
    }

}
