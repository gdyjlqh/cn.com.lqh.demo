package mediator;

/**
 * Created by misu on 2018/1/21.
 */
public class Renter extends Person {
    private HouseInfo houseInfo;

    public HouseInfo getHouseInfo() {
        return houseInfo;
    }

    public void setHouseInfo(HouseInfo houseInfo) {
        this.houseInfo = houseInfo;
    }
    public Renter(String name) {
        super(name);
    }

    public void sendMsg(HouseInfo houseInfo) {
        System.out.printf(">>%s发布求租请求：%s\n",getName(),houseInfo);
        this.setHouseInfo(houseInfo);
        getMediator().broadMsg(this,houseInfo);
    }

    public void getMsg(String msg) {
        System.out.printf("<<%s收到信息：%s\n",getName(),msg);
    }

    public HouseInfo getHouse(HouseInfo houseInfo) {
        if (this.houseInfo.getSize() == houseInfo.getSize() && this.houseInfo.getPrice() == houseInfo.getPrice()) {
            return this.houseInfo;
        }
        return null;
    }
}
