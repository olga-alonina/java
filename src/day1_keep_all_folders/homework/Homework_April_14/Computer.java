package day1_keep_all_folders.homework.Homework_April_14;

public class Computer {
    String brand, color;
    double price;
    static boolean hasScreen,hasBattery,hasMemory;

    static {
        boolean hasScreen = true,hasBattery = true, hasMemory = true;
    }

    public Computer(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    /*
Q: What is the difference between instance and static members
Q: How does the static block work
Q: How does the constructor work
Q: What are the possible static members*/
}
