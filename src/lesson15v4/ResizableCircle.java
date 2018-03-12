package lesson15v4;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        double radius = getRadius();
        setRadius(radius*(percent/100));
    }
}
