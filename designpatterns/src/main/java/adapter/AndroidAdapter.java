package adapter;

/**
 * Android充电器
 * Created by misu on 2018/1/22.
 */
public class AndroidAdapter extends PhoneTarget implements AC220Adaptee {


    private AndroidAdapter(String name,String type, int size) {
        super(name,type, size);
    }

    public AndroidAdapter() {
        super("android","DC",5);
    }

    public void output(String type, int size) {
        System.out.printf("充电器输出电源：%s/%s\n",type,size);
        checkCurrent(type,size);
    }

    public void input(String type,int size) {
        System.out.printf("充电器输入电源：%s/%s\n",type,size);
        if("AC".equals(type)) {
            type = getType();
        }
        if(size == 220){
            size = getSize();
        }
        output(type,size);
    }
}
