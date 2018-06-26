package observer;

/**
 * Created by misu on 2018/1/24.
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String operate, Object data) {
        System.out.printf("%s收到: %s:%s\n",name,data,operate);
    }

    @Override
    public String toString() {
        return name;
    }
}
