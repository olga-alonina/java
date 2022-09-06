package OH.OH_1_12;

import java.util.Scanner;

public class Discount {
    /*A book store will give discount of 10% if the cost of purchased quantity is more than 1000.
							Create a quantity variable
							    Suppose, one unit will cost 100.
							    Judge and print total cost for user.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  purchased quantity: ");
        double quantity = input.nextDouble();
        double discount = 0.1;
        double result;
        double sumDiscount;

        if (quantity > 1_000) {
            sumDiscount = quantity*discount;
           result = quantity-sumDiscount;
            System.out.println("You get a discount of $"+sumDiscount+" and your total cost is $ "+result);
        }
        else{
            System.out.println("No discount applied");
        }

    }
}
