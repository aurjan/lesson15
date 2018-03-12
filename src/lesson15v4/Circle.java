package lesson15v4;

public class Circle implements GeometricObject {
    private double radius;
    public static final double pi = 3.14;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }
}
