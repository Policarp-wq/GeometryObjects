import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var objs = new GeometryObject[]
                {new Rectangle(4, 2), new Triangle(3, 4, 5), new Circle(3)};
        Arrays.sort(objs);
        System.out.println(Arrays.toString(objs));
        objs[0].scale = 200;
        objs[1].scale = 1;
        objs[2].scale = 13;
        Arrays.sort(objs);
        System.out.println(Arrays.toString(objs));
    }
}