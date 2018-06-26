package single.demo01;

/**
 * Created by misu on 2018/1/20.
 */
public class SynSingleton {

    private static SynSingleton instance = null;

    private SynSingleton(){};
    public static SynSingleton getInstance(){
        if(instance == null){
            synchronized (instance){
                if(instance == null){
                    instance = new SynSingleton();
                }
            }
        }
        return instance;
    }

}
