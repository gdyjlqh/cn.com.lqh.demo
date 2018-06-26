package adapter;

/**
 * 安卓手机
 * Created by misu on 2018/1/22.
 */
public class AndroidPhoneTarget extends PhoneTarget {

    /**
     * android手机统一充电接口，不使用充电接口
     * @param type
     * @param size
     */
    private AndroidPhoneTarget(String name,String type, int size) {

        super(name,type, size);
    }

    /**
     * android手机统一充电接口 DC/5v
     */
    public AndroidPhoneTarget(){

        super("android","DC", 5);
    }

    public void input(String type, int size) {
        checkCurrent(type,size);
    }


}
