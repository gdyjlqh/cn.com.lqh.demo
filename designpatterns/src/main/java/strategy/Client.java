package strategy;

/**
 * Created by misu on 2018/1/22.
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.execute();

        strategy = new ConcreteStrategy2();
        context = new Context(strategy);
        context.execute();
    }
}
