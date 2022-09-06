package day1_keep_all_folders.May.May_14_day_57_exeptions.learn;

public class FourthTry {
    public static void main(String[] args) {
        try {
            System.out.println( "Start" );
            Thread.sleep( -2000 );
            System.out.println("Finish");
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
    }
}
