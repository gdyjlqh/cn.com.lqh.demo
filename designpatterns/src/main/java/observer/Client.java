package observer;

/**
 * Created by misu on 2018/1/24.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        ConcreteObserver a = new ConcreteObserver("小A");
        subject.register(a);

        subject.register(new ConcreteObserver("老K"));

        subject.unRegister(a);

    }
}
