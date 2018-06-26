package factory.demo02;

/**
 * Created by misu on 2018/1/20.
 */
public class Client {
    public static void main(String[] args) {
        MuliMethodSenderFactory.mailProduce().send("hello!");
        MuliMethodSenderFactory.smsProduce().send("hello!");
    }
}
