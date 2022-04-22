package day1_keep_all_folders.homework.Homework_April_14;

public class Debit_Card {

    long card_number;
    String holder_name, card_type;
    int pin;
    double balance;
    static String account_type;

    static {
        account_type = "debit";
    }

    public Debit_Card(long card_number, String holder_name, double balance) {
        if (String.valueOf( card_number ).length() != 16) {
            System.err.println( " Invalid card number "+ holder_name);
            this.holder_name = holder_name;
            this.balance = balance;
        } else {
            this.card_number = card_number;
            this.holder_name = holder_name;
            this.balance = balance;
        }
    }

    public Debit_Card(long card_number, String holder_name, String card_type, int pin, double balance) {
        this( card_number, holder_name, balance );

        if (card_type.equalsIgnoreCase( "MasterCard" ) || card_type.equalsIgnoreCase( "Visa" )) {
            this.card_type = card_type;
        } else {
            System.err.println( " Invalid card type "+holder_name );
        }
        if (String.valueOf( pin ).length() != 4) {
            System.err.println( " Invalid pin length "+holder_name );
        } else {
            this.pin = pin;
        }
    }

    @Override
    public String toString() {
    String obj = "";
     obj+= ((card_number != 0) ? "card number is " + card_number : "") + ((holder_name != null) ? " holder name is " + holder_name : "")
                + ((card_type != null) ? " card type is " +card_type : "") + ((balance != 0) ?" balance are " + balance : "");
     return obj;
    }
}
