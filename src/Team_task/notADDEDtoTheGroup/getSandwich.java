package Team_task.notADDEDtoTheGroup;



public class getSandwich {
    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
     getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""*/
    public static String getSandwich(String str) {
        String getSandwich = "";
        if(str.contains( "bread" )){
            str = str.replaceFirst( "bread"," " );
            if(str.contains( "bread" )){
                getSandwich =str.substring( str.indexOf( " " )+1, str.lastIndexOf( "bread") );

            }
        }
        return getSandwich;
    }

    public static void main(String[] args) {
        System.out.println( getSandwich( "breadjambread" ) );
        System.out.println( getSandwich( "xxbreadjambreadyy" ) );
        System.out.println( "empty "+ getSandwich( "xxbreadyy" ) );
    }
}
