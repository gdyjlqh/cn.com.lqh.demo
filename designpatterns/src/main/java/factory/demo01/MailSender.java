package factory.demo01;

/**
 * Created by misu on 2018/1/20.
 */
public class MailSender implements Sender {

    private String name;
    public MailSender(String name){
        this.name = name;
    }

    public void send(String msg) {
        System.out.println(name + ":" +msg);
    }
}
