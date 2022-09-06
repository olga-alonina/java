package day1_keep_all_folders.May.May15_day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank acc1 = new Bank();
        acc1.balance = 1_000;
        acc1.withdraw( 500 );
        System.out.println( "acc1.balance = " + acc1.balance );
     //   acc1.withdraw( 2_000 );
        try {
            acc1.login( "jamesbond", "007" );
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
        try {
            acc1.login( "jamesbond", "something" );
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
        try {
            acc1.login( "something", "007" );
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}