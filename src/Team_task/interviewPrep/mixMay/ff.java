package Team_task.interviewPrep.mixMay;

public class ff {
    /*Return true if the given string begins with "mix", except
    the 'm' can be anything, so "pix", "9ix" .. all count.


    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/
    public static boolean mixStart(String str) {
        boolean hasMix = false;
        if(str.indexOf( "ix" )==1){
            hasMix=true;
        }
return hasMix;

    }

    public static void main(String[] args) {
        System.out.println( mixStart( "mix snacks" ) );
        System.out.println( mixStart( "pix snacks" ) );
        System.out.println( mixStart( "piz snacks" ) );
    }

}
