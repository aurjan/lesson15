package lesson15;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side ) {
        super(color, filled, side, side);
        this.side = side;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
