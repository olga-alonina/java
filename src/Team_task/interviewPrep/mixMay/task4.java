package Team_task.interviewPrep.mixMay;

public class task4 {
    /*Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"*/
    public static String doubleChar(String str) {
        char[]str1 = str.toCharArray();
        String str2 = "";
        for(char each:str1){
            str2+=""+each+""+each;
        }
return str2;
    }

    public static void main(String[] args) {
        System.out.println( doubleChar( "The" ) );
        System.out.println( doubleChar( "AAbb" ) );
        System.out.println( doubleChar( "Hi-There" ) );
    }

}
