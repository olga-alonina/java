package day1_keep_all_folders.homework.Homework_April_26_problemSet.amazon_account;

public class UseAmazon {
    public static void main(String[] args) {
        Amazon_Account news = new Amazon_Account( "Welly", "Well@gmail.com", false );
        System.out.println(news);
        System.out.println("*******Email************");
        news.setEmail( "ola@changes.com" );
        System.out.println( news.getEmail() );

        System.out.println("*******Name************");
        news.setUserName( "Ola" );
        System.out.println( news.getUserName() );

        System.out.println("*******Boolean************");
        news.setHasPrime( true );
        System.out.println( news.getHasPrime());

    }
}
