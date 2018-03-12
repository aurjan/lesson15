package lesson15;

public class Circle extends Shape {
    private double radius;
    public static final double pi = 3.14;
    Circle(double radius){
        this.radius = radius;

    }
    Circle(double radius, String color, boolean filled ) {
        super(color, filled);
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.pow(this.radius,2)*pi;
    }

    @Override
    double getPerimeter() {
        return 2*pi*this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
