package adapter;

/**
 * Created by misu on 2018/1/22.
 */
public class Client {

    public static void main(String[] args) {
        //原来
        PhoneTarget target = new AndroidPhoneTarget();
        target.input("AC",220);
        target.input("DC",5);
        System.out.println();


        //
        target = new AndroidAdapter();
        target.input("AC",220);

    }
}
