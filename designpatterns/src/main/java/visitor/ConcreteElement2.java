package visitor;

/**
 * Created by misu on 2018/1/24.
 */
public class ConcreteElement2 extends Element {
    public void doSomething() {
        System.out.println("Element 2 doSomething");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
