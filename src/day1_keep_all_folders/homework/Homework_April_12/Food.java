package day1_keep_all_folders.homework.Homework_April_12;

public class Food {
    String name;
    int quantity;
    double unit_Price, total_Price;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this( name );
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unit_Price) {
        this( name, quantity );
        this.unit_Price = unit_Price;
        calculatePrice();
    }

    private void calculatePrice() {
        total_Price = quantity * unit_Price;
    }

    @Override
    public String toString() {
        String res = "";
        res += quantity > 1 ? "You have " + quantity + " " + name + "'s" : "You have " + name +
                " \n";
        if (unit_Price != 0) {
            res += " with price " + unit_Price + " per each and your total will" +
                    " be " + total_Price + " $\n";
        }

        return res;
    }
}
