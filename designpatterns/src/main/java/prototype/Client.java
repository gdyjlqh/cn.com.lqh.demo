package prototype;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {


        for (int i=0;i<5;i++){
            Shape shape = ShapeCache.getShapeByType("Cirle");
            System.out.println(shape + ",hasCode:" + shape.hashCode());
        }

    }


}
