package prototype;

/**
 * Created by misu on 2018/1/21.
 */
public class Rectangle extends Shape {
    public Rectangle(int id, String type) {
        super(id, type);
    }

    public void draw() {
        System.out.println("draw:"+getType());
    }
}
