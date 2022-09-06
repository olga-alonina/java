package Extra_Tasks;

public class Q27substring_Ex1 {
    //27. Write a Java program to get a substring of a given string between two specified positions. Go to the editor
    //old = The quick brown fox jumps over the lazy Dog.
    //new = brown fox jumps
    public static void main(String[] args) {
        String old = "The quick brown fox jumps over the lazy Dog";
        System.out.println( old.substring( old.indexOf( "brown" ), old.indexOf( "over" ) ) );
    }
}


