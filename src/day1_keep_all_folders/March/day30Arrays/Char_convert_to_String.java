package day1_keep_all_folders.March.day30Arrays;

public class Char_convert_to_String {
    public static void main(String[] args) {
        // convert a char array to a String

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
        //  System.out.println(day.toUpperCase()); cannot use String methods on a char []
    }
}
