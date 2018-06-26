package mediator;

/**
 * 出租房子信息，配合场景使用，不参与设计模式角色
 * Created by misu on 2018/1/21.
 */
public class HouseInfo {
    private int price;
    private int size;
    private Landlord landlord;
    private Renter renter;

    public HouseInfo(int price, int size) {
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public String toString() {
        return String.format("房子信息:共%s平方,%s元每月",size,price);
    }
}
