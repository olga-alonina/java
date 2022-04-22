package day1_keep_all_folders.March.day21Replace;

public class factorial {
    public static void main(String[] args) {
        int number =10;
        int result = 1;
        while(number>1) {
            System.out.println(result+"*"+number);
            result *= number;
            number--;
            System.out.println(result);
        }
    }}


