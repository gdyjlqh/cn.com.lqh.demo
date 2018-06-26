package visitor;

/**
 * Created by misu on 2018/1/24.
 */
public interface IVisitor {

    public void visit(ConcreteElement1 el1);

    public void visit(ConcreteElement2 el2);
}
