package day1_keep_all_folders.homework.Homework_May_3.Shopping;

public final class Target extends Shopping {
    public double price;
    @Override
    public void buyItem() {
        System.out.println("Buying from Target");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Target");

    }
}
