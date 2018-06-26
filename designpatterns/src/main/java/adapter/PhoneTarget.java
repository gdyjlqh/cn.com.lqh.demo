package adapter;

/**
 * 手机 直流电充电
 * Created by misu on 2018/1/22.
 */
public abstract class PhoneTarget {
    /**
     * 充电电源类型 AC/
     */
    private String type;
    /**
     * 充电电压
     */
    private int size;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneTarget(String name,String type, int size) {
        this.type = type;
        this.size = size;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 手机如电
     */

    public abstract void input (String type,int size);

    /**
     * 检查充电输入
     * @param type
     * @param size
     */
    public void checkCurrent(String type, int size) {
        System.out.print("检查充电输入:");
        if(getType().equals(type) && getSize() == 5){
            System.out.printf("%s手机使用电源%s/%s充电\n",name,type,size);
        }else{
            System.out.printf("%s手机不能直接使用电源%s/%s充电\n",name,type,size);
        }
    }
}
