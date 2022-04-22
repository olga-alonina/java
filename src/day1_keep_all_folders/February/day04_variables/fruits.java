package day1_keep_all_folders.February.day04_variables;

public class fruits {
    public static void main(String[] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("apples  " + apples);
        System.out.println("grapes  " + grapes);
        System.out.println("bananas  " + bananas);
        System.out.println("___________________");
        System.out.println("sold some apples");
        apples = 30;
        int price = 20;
        // apples after selling
        System.out.println("apples after selling  " + apples);

        System.out.println("price of my " +apples+ " apples is $" +apples*price);
    }
}