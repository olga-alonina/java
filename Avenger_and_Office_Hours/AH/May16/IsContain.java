package AH.May16;

public class IsContain {
    /* Write a program that determines if the given sentence contains the given word (Do not use contains() method)
     Input: String sentence = "Java is the best programming language"
    String word = "Java";   Output: true*/
    public static boolean isContain(String sentence, String word) {
        boolean isContain = false;
        String[] sen1 = sentence.split( " " );
        for (String each : sen1) {
            if(each.equalsIgnoreCase( word )){
                isContain = true;
                break;
            }

        }
        return isContain;
    }

    public static void main(String[] args) {
        String sentence = "Java is the best programming language";
        String word = "Java";
        System.out.println(isContain(  sentence,  word ));
    }
}
