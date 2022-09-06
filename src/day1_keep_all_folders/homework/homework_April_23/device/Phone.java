package day1_keep_all_folders.homework.homework_April_23.device;

public class Phone extends device {
    String name;

    public Phone(String brand, String name) {
        super( brand );
        this.name = name;
    }

    @Override
    public void useDevice() {
        this.brand = brand;
        System.out.println( "using device " + name );

    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", has_Wireless=" + has_Wireless +
                '}';
    }

}

