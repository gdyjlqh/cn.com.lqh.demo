package decorator;

/**
 * Created by misu on 2018/1/22.
 */
public class Decorator implements Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        component.operate();
    }
}
