package proxy;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.doSomething();
    }
}
