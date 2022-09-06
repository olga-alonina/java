package OH.OH_13_14;

public class CalcFeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        /*- You should validate that the first parameter feet is >=0, and second parameter
					inches is >=0 and <=12.
					 Return -1 from the method if either of the above is not true.*/
        // dano amount in feet and inches. we need to convert then to cm
        double cmFeet = feet * 30.48;
        double cmInch = inch * 2.54;
        if (feet < 0 || inch < 0 || inch > 12) {
            return -1;
        } else {
            return cmFeet + cmInch;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        if (inch < 0) {
            return -1;
        } else {
            int feet = (int) inch / 12;
            double inches_After_Converting = inch % 12;
            return calcFeetAndInchesToCentimeters(feet, inches_After_Converting);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 5));
        System.out.println("************");
        System.out.println(calcFeetAndInchesToCentimeters(70));
        System.out.println(calcFeetAndInchesToCentimeters(-5));

    }
}



