package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 房东
 * Created by misu on 2018/1/21.
 */
public class Landlord extends Person{
    public List<HouseInfo> getHouseInfoList() {
        return houseInfoList;
    }

    public void setHouseInfoList(List<HouseInfo> houseInfoList) {
        this.houseInfoList = houseInfoList;
    }

    private List<HouseInfo> houseInfoList = new ArrayList<HouseInfo>();
    public Landlord(String name,HouseInfo houseInfo) {
        super(name);
        houseInfo.setLandlord(this);
        houseInfoList.add(houseInfo);
    }

    public void addHouse(HouseInfo houseInfo){
        houseInfoList.add(houseInfo);
    }

    /**
     * 发布房子
     * @param house
     * @return
     */
    public void sendMsg(HouseInfo house) {
        System.out.printf(">>%s出租房子：%s\n",getName(),house);
        getMediator().broadMsg(this,house);
    }

    /**
     *
     * @param msg
     * @return
     */
    public void getMsg(String msg) {

        System.out.printf("<<%s收到信息：%s\n",getName(),msg);
    }

    public HouseInfo getHouse(HouseInfo houseInfo) {
        for (HouseInfo h:houseInfoList){
            if(h.getSize() == houseInfo.getSize() //
                && h.getPrice() == houseInfo.getPrice()){
                return h;
            }
        }
        return null;
    }
}
