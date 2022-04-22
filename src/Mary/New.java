package Mary;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a speed:");
        int speed = input.nextInt();
        System.out.println("Please enter a visibility:");
        int visibility = input.nextInt();

        if (speed > 25 && visibility < 20) {
            speed = 25;
            System.out.println("caution");
        }

        System.out.println("Speed " + speed);
        System.out.println("*************");
    }
}
