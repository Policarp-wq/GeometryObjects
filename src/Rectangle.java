public class Rectangle extends GeometryObject{
    private double a, b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a * scale;
    }

    public double getB() {
        return b * scale;
    }


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return getA() * scale * getB() * scale;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", scale=" + scale +
                ", square=" + getSquare() +
                '}';
    }
}
