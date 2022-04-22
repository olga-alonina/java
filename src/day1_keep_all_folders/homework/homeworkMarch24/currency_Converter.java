package day1_keep_all_folders.homework.homeworkMarch24;

public class currency_Converter {
    public static void main(String[] args) {

        System.out.println(currency_type("euro", 100));
        System.out.println(currency_type("yen", 50));
        System.out.println(currency_type("ruble", 50));
    }

    public static double currency_type(String nameOfMoney, double amount) {
      /*create a method that will accept a currency type(String) and a currency
amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type*/
        /*
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
Note: Don't worry about decimal formats, focus on method*/
        double total = 0;
        switch (nameOfMoney) {
            case "euro":
                return total = amount * 0.91;
            case "yen":
                return total = amount * 121.03;
            case "lira":
                return total = amount * 14.85;
            case "won":
                return total = amount * 1_217.52;
            case "rupee":
                return total = amount * 181.45;
            default:
                System.out.println("You add invalid type of money");
                return 0;
        }

    }
}
