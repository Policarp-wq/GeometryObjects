public class Circle extends GeometryObject{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius * scale;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", scale=" + scale +
                ", square=" + getSquare() +
                '}';
    }
}
