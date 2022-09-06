package day1_keep_all_folders.homework.Homework_May_3.Shopping;

public class useShopping {
    public static void main(String[] args) {
        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();
        //target.payForShipping( true); target class is not implemented The Shipping interface
        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
    }
}
