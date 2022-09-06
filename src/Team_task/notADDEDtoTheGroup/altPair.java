package Team_task.notADDEDtoTheGroup;

public class altPair {
    /*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
          012345
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/
    public static String altPairs(String str) {
        String altPairs = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            altPairs += str.charAt( i );
            count += 1;
            if (count == 2) {
                i += 2;
                count = 0;
            }
        }
        return altPairs;
    }

    public static void main(String[] args) {
        System.out.println( altPairs( "kitten" ) );
        System.out.println( altPairs( "Chocolate" ) );
        System.out.println( altPairs( "CodingHorror" ) );
    }

}
