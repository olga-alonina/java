package Team_task.Vesa.VesaPackMay12;

public class findUnique {
    /*String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";*/
    public static String findUnique(String str){
        String unique = "";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt( i )==str.charAt( i+1 )){
                str = str.replace(""+str.charAt( i ),"");
                i=0;
            }

        }unique = str;
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
    }
}
