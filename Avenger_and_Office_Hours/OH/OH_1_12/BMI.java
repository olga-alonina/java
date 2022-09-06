package OH.OH_1_12;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  your mass (ex. 70): ");
        double mass = input.nextDouble();
        System.out.println("please enter  your height(ex 1.82): ");
        double height = input.nextDouble();
        double BMI = mass / (height*height);
        String result = " ";

        if (BMI < 18.5) {
            result = "Underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            result = "Normal weight";
        } else if (BMI >= 25 && BMI < 30) {
            result = "Overweight";
        } else if (BMI >= 30) {
            result = "Obese";
        }
        System.out.println(result);
    }

}
