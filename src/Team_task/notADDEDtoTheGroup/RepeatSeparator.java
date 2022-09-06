package Team_task.notADDEDtoTheGroup;

public class RepeatSeparator {
    /*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word, separated by the separator string.
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"*/
    public static String repeatSeparator(String word, String sep, int count) {
        String repeatSeparator = "";
        if (!sep.isEmpty() && count > 0) {
            for (int i = 0; i < count - 1; i++) {
                repeatSeparator += word + sep;
            }
            repeatSeparator += word;
        }
        if (count == 0&&sep.isEmpty()) {
            repeatSeparator ="";
        }
        if (sep.isEmpty()&&count != 0) {
            repeatSeparator+=word;
        }

        return repeatSeparator;
    }

    public static void main(String[] args) {
        System.out.println("empty "+ repeatSeparator( "AAA", "", 0 ) );
        System.out.println("0 sep " +repeatSeparator( "AAA", "", 1 ) );
        System.out.println( repeatSeparator( "Word", "X", 3 ) );
        System.out.println( repeatSeparator( "This", "And", 2 ) );
        System.out.println( repeatSeparator( "This", "And", 1 ) );
    }
}
