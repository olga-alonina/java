package Team_task.interviewPrep.mixMay;

public class task2 {
  /*  Suppose the string "yak" is unlucky. Given a string,
   return a version where all the "yak" are removed, but the "a"
    can be any char. The "yak" strings will not overlap.


    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"*/
    public static String   stringYak (String str){
        String str2="";
        if(str.contains( "yak" )){
            str2 = str.replace("yak","" );
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println( stringYak( "yakpak" ) );
        System.out.println( stringYak( "pakyak" ) );
        System.out.println( stringYak( "yak123ya" ) );
    }
}
