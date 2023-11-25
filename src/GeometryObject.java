public abstract class GeometryObject implements Comparable<GeometryObject> {
    public double scale = 1;
    public abstract double getSquare();

    @Override
    public int compareTo(GeometryObject o) {
        return Double.compare(getSquare(), o.getSquare());
    }
}
