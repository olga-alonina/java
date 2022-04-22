package homework_April_17;

public class Square {
    private  int side;

    public Square(int side) {
        setSide( side );

    }

    public void Square() {
        this.side = side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public  int calculateArea() {
        return side*side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "side= " + side;

    }

}
