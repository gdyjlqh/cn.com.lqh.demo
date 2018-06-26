package observer.demo1;

/**
 * Created by misu on 2018/1/24.
 */
public class Client {

    public static void main(String[] args) {
        Puster puster = new Puster();

        Reader reader1 = new Reader("小A");
        Reader reader2 = new Reader("老K");
        puster.addObserver(reader1);
        puster.addObserver(reader2);
        puster.addObserver(reader2);
        puster.write("我讲个冷笑话。哈哈哈哈哈");


    }
}
