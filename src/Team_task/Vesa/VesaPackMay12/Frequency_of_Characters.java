package Team_task.Vesa.VesaPackMay12;

public class Frequency_of_Characters {
    /*Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void frequency_of_Characters(String str) {
        int count = 1;
        String ret = "";
        int i = 0;
        do {
            if (str.charAt( i ) == str.charAt( i + 1 )) {
                count++;
                i++;
            } else {
                ret += "" + str.charAt( i ) + count;
                count = 1;
                i++;
            }
        } while (i != str.length() - 1);
        int last = str.length() - 1;

        if (i == str.length() - 1 && str.charAt( last ) == str.charAt( (last - 1) )) {
            ret += "" + str.charAt( last ) + count;
           System.out.println( ret );
        }
    }


    public static void main(String[] args) {
        frequency_of_Characters( "AAABBCDD" );
    }
}
