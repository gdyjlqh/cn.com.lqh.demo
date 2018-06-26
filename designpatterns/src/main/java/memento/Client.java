package memento;

/**
 * Created by misu on 2018/1/24.
 */
public class Client {


    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("false");
        System.out.println("state:"+originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("state:"+originator.getState());
    }
}
