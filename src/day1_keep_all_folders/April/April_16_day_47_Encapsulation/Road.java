package day1_keep_all_folders.April.April_16_day_47_Encapsulation;

public class Road {
    public static void main(String[] args) {
        Traffic_Lights light =
                new Traffic_Lights( "Grey" );
        System.out.println( light.color );
        //light.color = "Pink";
        Traffic_Lights light2 =
                new Traffic_Lights( "Red" );
        System.out.println( light2.getColor() );
    }
}
