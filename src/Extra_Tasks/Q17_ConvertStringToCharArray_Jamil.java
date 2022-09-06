package Extra_Tasks;


    import java.util.Arrays;

    public class Q17_ConvertStringToCharArray_Jamil {
        /*
        17. Write a Java program to get the contents of a given string as a character array. Go to the editor

    Sample Output:

    The char array equals "[C@2a139a55"
         */
        public static void main(String[] args) {

            String word ="   Java   is  fun ";
            System.out.print("\n\t- With white space :" +word);
            String word1 = word.replaceAll(" ","");
            System.out.print("\n\t- Without white space :" +word1);
            System.out.println("\n----------Char Array--------------");

            char[] charArray = new char[word1.length()];

            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = word1.charAt(i);
            }
            System.out.print("\n\t- Char Array: ");
            for (char each: charArray){
                System.out.print(each+" ");
            }
            System.out.println();
            System.out.println("\t- After conversion String to Array: "+ Arrays.toString(charArray));
        }


    }


