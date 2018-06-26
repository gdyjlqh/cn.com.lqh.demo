package factory.demo01;

/**
 * 简单工厂模式
 * Created by misu on 2018/1/20.
 */
public class SenderFactory {

    public static Sender produce(String type){
        if("mail".equalsIgnoreCase(type)){
            return new MailSender(type);
        }else if("sms".equalsIgnoreCase(type)) {
            return new SmsSender(type);
        }
        return null;
    }

}








