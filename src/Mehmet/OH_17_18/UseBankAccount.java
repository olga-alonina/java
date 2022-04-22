package Mehmet.OH_17_18;

public class UseBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount( "Neli", "1234567", 3000 );
        System.out.println( bankAccount );
        bankAccount.check_Balance();
        System.out.println( "**deposit**" );
        bankAccount.deposit( 1000 );
        bankAccount.check_Balance();
        System.out.println( "**withdraw**" );
        bankAccount.withdraw( 100 );
        bankAccount.check_Balance();
    }
}

