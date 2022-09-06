package Team_task.interviewPrep.mixApril;

import java.util.Scanner;

public class squirrels_party {
    public static boolean squirrels_party() {
        boolean isSuccessful = false;
        Scanner input = new Scanner( System.in );
        System.out.println( "How many cigars are you have?" );
        int number_of_cigars = input.nextInt();
        System.out.println( "Its a weekend? Please write answer true or false" );
        boolean isWeekend = input.nextBoolean();
        if (number_of_cigars >= 40 && number_of_cigars <= 60) {
            isSuccessful = true;
        } else {
            if (isWeekend) {
                isSuccessful = true;
            }


        }
        return isSuccessful;
    }

    public static void main(String[] args) {

        System.out.println("Party is successful "+squirrels_party());
    }
}
