package day1_keep_all_folders.May.May15_day58_exceptions.bank;

public class Bank {
    double balance;

    public void withdraw(double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new NotEnoughMoneyException();
        }
        balance -= amountToTakeOut;
    }

    public void login(String username, String password) throws InvalidCredentialsException {
        if (!username.equals( "jamesbond" )) {
            throw new InvalidCredentialsException( "Invalid username" );
        }
        if (!password.equals( "007" )) {
            throw new InvalidCredentialsException( "Invalid password" );
        }
        System.out.println("Log in");

    }
}

