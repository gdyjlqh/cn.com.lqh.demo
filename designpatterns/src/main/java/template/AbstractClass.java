package template;

/**
 * Created by misu on 2018/1/21.
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法2
    protected abstract void doAynthing();

    //模板方法
    public void templateMethod(){
        System.out.print("打开APP:");
        doSomething();
        doAynthing();
    }
}
