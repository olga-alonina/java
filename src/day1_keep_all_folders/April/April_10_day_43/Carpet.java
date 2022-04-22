package day1_keep_all_folders.April.April_10_day_43;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputIsPersian, double inputWidht, double inputLength, double inputUnitPrice) {
        width = inputWidht;
        isPersian = inputIsPersian;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }
    }
    public String toString(){
        return (isPersian ? "The Persian Carpet " : "The Carpet ") +
                "\nhas dimensions of " + length + " x " + width +
                "\nThe unit price is " + unitPrice +
                "\nAll coming to a total of: " + totalPrice;
    }
}
