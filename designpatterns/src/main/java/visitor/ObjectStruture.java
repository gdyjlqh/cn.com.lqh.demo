package visitor;

import java.util.Random;

/**
 * Created by misu on 2018/1/24.
 */
public class ObjectStruture {

    public static Element createElement(){
        Random random = new Random();
        if(random.nextBoolean()){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }

    }
}
