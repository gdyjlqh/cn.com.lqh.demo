package facade;

/**
 * Created by misu on 2018/1/24.
 */
public class Facade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();


    public void doSomething(){
        a.doSomething();
        b.doSomething();
        c.doSomething();
    }
}
