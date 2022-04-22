package Mehmet.OH_1_12;

public class Armstrong_number {
    public static void armstrong_number(int number) {
        /*   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number.
			 If the number obtained equals the original number then, we call that armstrong number.*/
        /*
                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153*/
        boolean hasArms = false;
        for (int i = 0; i < 10; i++) {//100 200 300 400 500
            for (int j = 0; j < 10; j++) {//10,20,30,40
                for (int k = 0; k < 10; k++) {//1,2,3,4,5
                    number = 100 * i + 10 * j + k;
                    if ((i * i * i) + (j * j * j) + (k * k * k) == number) {
                        if (number > 99) {
                            hasArms = true;
                            System.out.print(number + " ");

                        } else {
                            hasArms = false;
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.print(hasArms);
        System.out.println("\n************************\nother solition \n************************");
        for (int i = 100; i < 1000; i++) {
            isArmstrong(i);
        }
    }
    public static void isArmstrong(int number) {
        int lastDigit = 0;
        int totalDigits = 0;
        int originalNumber = number;

        while (number > 0) {
            lastDigit = number % 10;    // to find last digit
            // System.out.println("lastDigit "+lastDigit);
            number /= 10;
            //number=number/10;
            totalDigits += lastDigit * lastDigit * lastDigit;
            // Math class -- has pow method
        }
        if (totalDigits == originalNumber) {
            System.out.println(originalNumber);
        }
    }
    public static void main(String[] args) {
        armstrong_number(153);
    }
}

