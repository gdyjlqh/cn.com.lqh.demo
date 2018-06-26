package visitor;

/**
 * Created by misu on 2018/1/24.
 */
public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);
}
