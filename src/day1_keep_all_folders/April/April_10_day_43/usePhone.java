package day1_keep_all_folders.April.April_10_day_43;

public class usePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("x300" );
        System.out.println( "phone1 = " + phone1 );
        Phone phone2 = new Phone( "x200", "Apple" );
        System.out.println( "phone2 = " + phone2 );
        Phone phone3 = new Phone( "x100", "Samsung",
                600, 2.6 );
        System.out.println( "phone3 = " + phone3 );
    }
}
