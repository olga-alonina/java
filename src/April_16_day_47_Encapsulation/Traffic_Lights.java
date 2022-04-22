package April_16_day_47_Encapsulation;

public class Traffic_Lights {
    String color;

    public Traffic_Lights(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "Red":
            case "Yellow":
            case " Green":
                this.color = color;
        }
    }


}
