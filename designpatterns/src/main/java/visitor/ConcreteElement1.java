package visitor;

/**
 * Created by misu on 2018/1/24.
 */
public class ConcreteElement1 extends Element {
    public void doSomething() {
        System.out.println("Element 1 doSomething");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
