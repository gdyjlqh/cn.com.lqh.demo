package observer.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by misu on 2018/1/24.
 */
public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        if(o.equals(this)) return;
        if(arg == null){
            System.out.printf("粉丝+1,总粉丝：%s\n",o.countObservers());
        }
        System.out.printf("%s收到段子：",name);
        read(arg);
    }

    public void read(Object arg){
        System.out.printf("读段子：%s\n",arg);
    }
}
