package command;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {

    public static void main(String[] args) {
       Invoker invoker = new Invoker();
        invoker.setCommand(new CodeCommand(new ReqReceiver()));
        invoker.action();
    }
}
