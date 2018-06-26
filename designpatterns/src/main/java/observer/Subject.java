package observer;

/**
 * Created by misu on 2018/1/24.
 */
public interface Subject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObserver(String operate,Object data);
}
