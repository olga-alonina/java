package Team_task.interviewPrep.mixApril;

public class startHi {
    /*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/
    public static boolean startHi(String str) {
        boolean start = false;
        str = str.toLowerCase();
        if (str.startsWith( "hi" )) {
            start = true;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println( startHi( "hi there" ) );
        System.out.println( startHi( "hi" ) );
        System.out.println( startHi( "hello hi" ) );
    }
}
