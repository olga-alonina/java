package day1_keep_all_folders.June4_day65_stream;


public class Item {
    private String name;
    private double price;
    private int stars;

    public Item(String name, double price, int stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stars=" + stars +
                '}';
    }
}