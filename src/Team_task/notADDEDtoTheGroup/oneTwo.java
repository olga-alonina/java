package Team_task.notADDEDtoTheGroup;

public class oneTwo {
    /*    Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
       oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"*/
    public static String oneTwo(String str) {
        String res = "";
        for (int i = 0; i <str.length()-2 ; i+=3) {
            res+=""+str.charAt( i+1)+str.charAt( i+2 )+str.charAt( i );
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(oneTwo("tcagdo"));
    }
}
