package Team_task.Vesa.VesaPackMay12;

public class RemoveDuplicates {
    /* Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC*/
    public static String removeDuplicates(String str){
        String nondup = "";
        for (int i = 0; i <str.length() ; i++) {
            if(!nondup.contains( ""+str.charAt( i ) )){
                nondup+=""+str.charAt( i );
            }

        }
        return nondup;
    }

    public static void main(String[] args) {
        System.out.println( removeDuplicates( "AAABBBCCC" ) );
    }
}
