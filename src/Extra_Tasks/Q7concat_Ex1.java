package Extra_Tasks;

import java.util.Scanner;

public class Q7concat_Ex1 {
    public static void main(String[] args) {
        //7. Write a Java program to concatenate a given string to the end of another string. Go to the editor
        String one = "PHP Exercises and";
        String two = "Python Exercises";
        String newS = one.concat( " " + two );
        System.out.println( newS );
        System.out.println( "***auto***" );
        Scanner input = new Scanner( System.in );
        System.out.println( "Please write 1 sentence: " );
        String one1 = input.nextLine();
        System.out.println( "Please write 2 sentence: " );
        String two1 = input.nextLine();
        String newS1 = one1.concat( " " + two1 );
        System.out.println( newS1 );


    }
}
