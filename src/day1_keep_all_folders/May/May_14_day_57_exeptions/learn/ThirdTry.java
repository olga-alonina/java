package day1_keep_all_folders.May.May_14_day_57_exeptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner( (System.in) );
        try {
            System.out.println( "Enter number" );
            int number = input.nextInt();
            System.out.println( "Enter number 2" );
            int number2 = input.nextInt();
            System.out.println( number/number2 );

        } catch (InputMismatchException obj) {
            obj.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Funaly block");
            input.close();
        }
        System.out.println( "done" );
    }
}
