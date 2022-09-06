package day1_keep_all_folders.May.May15_day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

public  NotEnoughMoneyException(){
    super("Not enough money in the account");
}
        }