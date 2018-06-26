package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misu on 2018/1/24.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void register(Observer observer) {
        observers.add(observer);
        notifyObserver("register",observer);
    }

    public void unRegister(Observer observer) {
        observers.remove(observer);
        notifyObserver("unRigister",observer);
    }

    public void notifyObserver(String operate,Object data) {
        for (Observer ob:observers){
            ob.update(operate,data);
        }
    }
}
