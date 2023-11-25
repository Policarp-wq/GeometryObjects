public class Triangle extends GeometryObject{
    private double a, b, c;

    public double getA() {
        return a * scale;
    }

    public double getB() {
        return b * scale;
    }

    public double getC() {
        return c * scale;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        double p = (getA() + getB() + getC()) / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", scale=" + scale +
                ", square=" + getSquare() +
                '}';
    }
}
