package day1_keep_all_folders.April.April_26_day_52_inherietance.Final_Example;

public class Use_final_example {
    public static void main(String[] args) {
        System.out.println( Final_example.planet );
        Final_example news = new Final_example( 20 );
        System.out.println( news.a );
        System.out.println( news.b );
        Final_example news2 = new Final_example( 100 );
        System.out.println( news2.a );
        System.out.println( news2.b );
    }
}
