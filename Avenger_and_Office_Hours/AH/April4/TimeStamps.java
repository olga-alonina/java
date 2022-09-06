package AH.April4;

public class TimeStamps {
    /*   Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900*/
    public static String time_Stamp(String date) {
        return date = date.replace( "/", "" ).replace( ":",
                "" ).replace( " ", "" );


    }

    public static void main(String[] args) {
        String date = "10/10/2022 14:59:00";
        System.out.println( time_Stamp( date ) );
    }
}
