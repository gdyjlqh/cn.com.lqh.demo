package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by misu on 2018/1/21.
 */
public class ShapeCache {

    private static Map<String,Shape> map = new HashMap<String,Shape>();

    public static Shape getShapeByType(String type) throws CloneNotSupportedException {
        Shape shape = map.get(type);
        return shape.clone();
    }


    static {

        Rectangle rectangle = new Rectangle(1,"Rectangle");
        map.put(rectangle.getType(),rectangle);
        Cirle cirle = new Cirle(2,"Cirle");
        map.put(cirle.getType(),rectangle);
    }
}
