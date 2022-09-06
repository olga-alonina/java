package day1_keep_all_folders.homework.homework_April_17;

public class Pizza {
    String size;
    int number_Of_Toppings;
    double length, width;
    double price = 0;

    public Pizza(double length, double width) {
        this.length = length;
        this.width = width;
        setLength( length );
        setWidth( width );

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase( "small" )
                || size.equalsIgnoreCase( "medium" )
                || size.equalsIgnoreCase( "large" )) {
            this.size = size;
        } else {
            System.err.println( "Invalid size" );
        }
    }

    public int getNumber_Of_Toppings() {
        return number_Of_Toppings;
    }

    public void setNumber_Of_Toppings(int number_Of_Toppings) {
        if (number_Of_Toppings > 0) {
            this.number_Of_Toppings = number_Of_Toppings;
        } else {
            System.err.println( "Invalid number" );
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePrice(String size, int number_Of_Toppings) {
        if (size == null) {
            return -1;
        }
        if (size.equalsIgnoreCase( "Small" )) {
            price += 4;
        }
        if (size.equalsIgnoreCase( "Medium" )) {
            price += 6;
        }
        if (size.equalsIgnoreCase( "Large" )) {
            price += 8;
        }
        if (number_Of_Toppings > 0) {
            price += 0.75 * number_Of_Toppings;
        }

        return price;
    }

    @Override
    public String toString() {
        return size + " size pizza with " + number_Of_Toppings + " toppings will be " + price + " $";
    }
}

