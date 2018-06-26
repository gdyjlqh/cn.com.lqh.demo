package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misu on 2018/1/23.
 */
public class Composite extends Component {
    public void doSomething() {
        System.out.println("Composite doSomething");
    }

    private List<Component> components = new ArrayList<Component>();

    public void add(Component component){
        components.add(component);
    }

    public Component remove(int index){
        return components.remove(index);
    }

    public List<Component> getChildren(){
        return components;
    }
}
