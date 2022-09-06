package Extra_Tasks;

public class UnicodeCodePointMariia {

    /*
   2. Write a Java program to get the character (Unicode code point) at the given index within the String. Go to the editor

Sample Output:

Original String : w3resource.com
Character(unicode point) = 51
Character(unicode point) = 101
    */
    public static void main(String[] args) {
        System.out.println(unicode("w3resource.com", 1));
    }


    public static int unicode (String str,int element){

        return str.charAt(element);
    }

}
