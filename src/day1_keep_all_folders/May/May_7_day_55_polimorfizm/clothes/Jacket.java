package day1_keep_all_folders.May.May_7_day_55_polimorfizm.clothes;

public class Jacket extends Clothes implements HasHood {
    @Override
    public void wear() {
        System.out.println("Wearing a jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting a jacket hood on");

    }
}
