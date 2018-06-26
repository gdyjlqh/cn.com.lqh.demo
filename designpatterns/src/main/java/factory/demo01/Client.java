package factory.demo01;

/**
 * Created by misu on 2018/1/20.
 */
public class Client {
    public static void main(String[] args) {
        SenderFactory.produce("mail").send("hello!");
        SenderFactory.produce("sms").send("hello!");
    }
}
