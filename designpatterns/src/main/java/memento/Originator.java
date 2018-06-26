package memento;

/**
 * Created by misu on 2018/1/24.
 */
public class Originator {

    private String state = "true";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
