package strategy;

/**
 * Created by misu on 2018/1/22.
 */
public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.doSomething();
    }
}
