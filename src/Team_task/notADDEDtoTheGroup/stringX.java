package Team_task.notADDEDtoTheGroup;

public class stringX {
    /*Given a string, return a version where all the "x"
    have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"*/
    public static String stringX(String str) {
        String stringX="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt( i )=='x'&&i!=0&&i!=str.length()-1){
              str=str.replaceFirst( "x"," " );
            }else{
                stringX+=str.charAt( i );
            }
        }
return stringX;
    }

    public static void main(String[] args) {
        System.out.println( stringX( "xxHxix" ) );
        System.out.println( stringX( "abxxxcd" ) );
        System.out.println( stringX( "xabxxxcdx" ) );
    }

}
