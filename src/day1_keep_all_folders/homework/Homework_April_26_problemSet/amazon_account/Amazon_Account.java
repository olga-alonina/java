package day1_keep_all_folders.homework.Homework_April_26_problemSet.amazon_account;

public class Amazon_Account {
    String userName;
    String  email;
    boolean hasPrime;

    public Amazon_Account(String userName, String email, boolean hasPrime) {
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        return "Amazon_Account{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}
