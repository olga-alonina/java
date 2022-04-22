package Team_task;

import java.util.Scanner;

public class clock_Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it now? Please follow format XX XX");
        String timeStart = input.nextLine();
        String[] parts = timeStart.split(" ");
        System.out.println("How long is break time?");
        int timeBreak = input.nextInt();
        Integer hours = Integer.parseInt(parts[0]);
        Integer minutes = Integer.parseInt(parts[1]);
        Integer total = minutes + timeBreak;

        if (total < 60) {
            System.out.println("Returning time: " + hours + " " + total);
        } else {
            int add_To_Hours = (total % 60);
            total = total - 60 + add_To_Hours;
            hours = hours + 1;
            System.out.println("Returning at :" + hours + " " + total);
        }
    }
}
