package single.demo01;

/**
 * Created by misu on 2018/1/20.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        System.out.println("new Singleton()");
    }

    public void doSomething(){
        System.out.println("hashCode:"+this.hashCode() +" --> doSomething");
    }

    public static void main(String[] args) {
        Singleton instnace = Singleton.getInstance();
        instnace.doSomething();

        Singleton instance2 = Singleton.getInstance();
        instance2.doSomething();


    }
}
