package Mary;

import java.util.Scanner;

public class Goal_Eror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter goal:");
        int goal = input.nextInt();
        System.out.println("Please enter erors:");
        int erors  = input.nextInt();
        String result;
        if (goal>10&&erors ==0){
            result = "Wow";
        }
        else{
            result = "Oh well";
        }
        System.out.println("Long "+result);
        System.out.println("************");
        String result2 = (goal>10&&erors ==0)?"Wow":"Oh well";
        System.out.println("short "+result2);
    }

}
