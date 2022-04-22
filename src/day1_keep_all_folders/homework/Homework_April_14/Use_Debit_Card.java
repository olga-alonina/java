package day1_keep_all_folders.homework.Homework_April_14;

public class Use_Debit_Card {
    public static void main(String[] args) {
        Debit_Card client1 = new Debit_Card( 1234567890123456l, "Alonina Olga", 1200 );
        Debit_Card client2 = new Debit_Card( 123, "Vasya", 1200 );
        Debit_Card client3 = new Debit_Card( 1234567899874566l, "Alex", "Chase", 1254, 1200 );
        Debit_Card client4 = new Debit_Card( 1234567891234567l, "Anna", "Visa", 123456, 1200 );

        System.out.println( "client1 = " + client1 );
        System.out.println( "client2 = " + client2 );
        System.out.println( "client3 = " + client3 );
        System.out.println( "client4 = " + client4 );

        System.out.println( Debit_Card.account_type );
    }
}

