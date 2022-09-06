package Team_task.Vesa.VesaPackMay12;

public class Reverse {
    /*Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA*/
    public static String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=""+str.charAt( i );
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println( reverse( "ABCD" ) ); //DCBA
    }
}
