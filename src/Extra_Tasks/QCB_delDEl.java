package Extra_Tasks;

public class QCB_delDEl {
    /*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"*/
    public static String delDel(String str) {
        String str2 = "";
        if(str.indexOf( "del" )==1){
            str2=str.replaceFirst( "del","" );
        }else{
            str2=str;
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println( delDel( "adelbc" ) );
        System.out.println( delDel( "adelHello" ) );
        System.out.println( delDel( "adedbc" ) );
    }
}
