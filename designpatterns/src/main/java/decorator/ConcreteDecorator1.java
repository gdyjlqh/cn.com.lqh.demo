package decorator;

/**
 * Created by misu on 2018/1/22.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        doBefor();
        super.operate();
        doAfter();

    }

    public void doBefor(){
        System.out.println("decorate1 doBefor");
    }

    public void doAfter(){
        System.out.println("decorate1 doAfter");
    }


}
