package observer.demo1;


import java.util.Observable;

/**
 * 段子手
 * Created by misu on 2018/1/24.
 */
public class Puster extends Observable {


    /**
     * 写段子
     * @param article
     */
    public void write(String article){
        setChanged();
        notifyObservers(article);
    }
}
