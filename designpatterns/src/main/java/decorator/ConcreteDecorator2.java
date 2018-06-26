package decorator;

/**
 * Created by misu on 2018/1/22.
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        doBefor();
        super.operate();
        doAfter();
    }

    public void doBefor(){
        System.out.println("decorate2 doBefor");
    }

    public void doAfter(){
        System.out.println("decorate2 doAfter");
    }
}
