package template;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass toutiaoAPP = new ToutiaoAPP();
        toutiaoAPP.templateMethod();

        AbstractClass weixinAPP = new WeixinAPP();
        weixinAPP.templateMethod();


    }
}
