package day1_keep_all_folders.May.May_14_day_57_exeptions.learn;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println( "First Line" );

        try {

            String word = "java";

            System.out.println( word.charAt( 0 ) );

        } catch (Exception e) {
            System.out.println( "Exception happened" );
        }

        System.out.println( "Last Line" );
    }
}