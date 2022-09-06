package day1_keep_all_folders.homework.homework_April_23.device;

public class device {
    String brand, model;
    double price;
    boolean has_Wireless;

    public device(String brand) {
        this.brand = brand;
    }

    public void useDevice() {
        System.out.println( "using device " + brand );

    }

    @Override
    public String toString() {
        return "device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", has_Wireless=" + has_Wireless +
                '}';
    }
}
