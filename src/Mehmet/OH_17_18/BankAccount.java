package Mehmet.OH_17_18;

public class BankAccount {
    String AccountHolder;
    String AccountNumber;
    double Balance = 0;

    public BankAccount(String AccountHolder, String AccountNumber, double Balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println( "Depositing amount can not be zero or negative" );
        } else {
            Balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > Balance) {
            System.err.println( "Insufficient balance " );
        } else if (amount <= 0) {
            System.err.println( "Withdrawing amount can not be negative or zero" );
        } else {
            Balance -= amount;
        }
    }

    public void check_Balance() {
        System.out.println( "As of today , " + AccountHolder + " available balance is: " + Balance );
    }

    @Override
    public String toString() {
        return "Account holder " + AccountHolder +
                ",account number " + AccountNumber +
                ", Balance=" + Balance;
    }
}