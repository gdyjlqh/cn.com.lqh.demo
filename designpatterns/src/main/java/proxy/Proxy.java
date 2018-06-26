package proxy;

/**
 * Created by misu on 2018/1/21.
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void doSomething() {
        doBefore();
        subject.doSomething();
        doAfter();
    }

    private void doAfter() {
        System.out.println("doAfter");
    }

    private void doBefore() {
        System.out.println("doBefore");
    }
}
