package proxy;

/**
 * Created by misu on 2018/1/21.
 */
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println("doSomething...");
    }
}
