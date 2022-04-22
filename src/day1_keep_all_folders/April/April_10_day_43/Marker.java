package day1_keep_all_folders.April.April_10_day_43;

public class Marker {
    String type;
    String brand;
    String color;

    public Marker(String inputType, String inputBrand,
                  String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;

    }
    @Override
    public String toString() {
        return "*****Marker****\ntype \t" + type+
                "\nbrand\t" + brand +
                "\ncolor\t" + color;
    }

}
