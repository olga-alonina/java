package Mary;

import java.util.Scanner;

public class salary_deduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a salary:");
        double salary = input.nextDouble();
        System.out.println("Please enter a deduction:");
        double deduction = input.nextDouble();
        double net;
        String result;
        if (salary >= deduction) {
            result = "ok";
            net = salary - deduction;
        } else {
            result = "no way";
            net = salary;
        }
        System.out.println("long " + result + "\n " + net);
        System.out.println("***********");
        String result2 = (salary >= deduction) ? "ok " + (net = salary - deduction) : "no way" + (net = salary);

        System.out.println("short " + result2);
    }
}
