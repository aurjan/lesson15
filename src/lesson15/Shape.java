package lesson15;

abstract class Shape {
    private String color;
    private boolean filled;

    Shape(){
        super();
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }
    abstract double getArea();

    public boolean isFilled() {
        return filled;
    }
    abstract double getPerimeter();

    @Override
    public String toString() {
        return super.toString();
    }

    public String getColor() {
        return color;
    }
}
