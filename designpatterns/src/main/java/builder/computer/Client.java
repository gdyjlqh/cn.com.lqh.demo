package builder.computer;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("售货员：您好，需要买什么品牌电脑？");
        String sign = "lenove";
        System.out.println("顾客："+sign);
        Director director = new Director(sign);
        System.out.println("售货员：稍等...");
        System.out.println("========================");
        System.out.println("========================");
        System.out.println("售货员去找电脑组装员工组要装电脑");
        Computer computer = director.construct();
        System.out.println("售货员拿到组装的电脑");
        System.out.println("========================");
        System.out.println("========================");
        if(computer == null){
            System.out.println("没有这类型电脑");
        }else {
            System.out.println("电脑配置如下："+computer);
        }

    }
}
