package Extra_Tasks;

public class Q_MixPixPiz {
    /*
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */
    public static boolean containsIX(String str){
        if(str.indexOf("ix")==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "piz snack";
        System.out.println(containsIX(str));
    }
}
