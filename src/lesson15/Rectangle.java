package lesson15;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(){};
    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return this.length*this.width;
    }

    @Override
    double getPerimeter() {
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
