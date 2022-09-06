package day1_keep_all_folders.homework.Homework_May_3.Shopping;

public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println( "Viewing Amazon cart" );
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println( b ? "Pay for shipping" : "Free Shipping" );
    }

    @Override
    public void buyItem() {
        System.out.println( "Buying item from Amazon" );
    }

    @Override
    public void returnItem() {
        System.out.println( "Returning to Amazon drop location" );
    }
}
