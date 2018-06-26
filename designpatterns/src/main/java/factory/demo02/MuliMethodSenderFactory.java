package factory.demo02;

import factory.demo01.MailSender;
import factory.demo01.Sender;
import factory.demo01.SmsSender;

/**
 * Created by misu on 2018/1/20.
 */
public class MuliMethodSenderFactory {
    public static Sender mailProduce() {
        return new MailSender("mail");
    }
    public static Sender smsProduce() {
        return new SmsSender("mail");
    }
}
