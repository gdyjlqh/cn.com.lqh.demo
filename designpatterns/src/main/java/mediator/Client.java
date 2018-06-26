package mediator;

/**
 * Created by misu on 2018/1/21.
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new HouseMediator();

        Landlord l1 = new Landlord("房东A",new HouseInfo(500,30));
        l1.setMediator(mediator);
        l1.sendMsg(l1.getHouseInfoList().get(0));

        Landlord l2 = new Landlord("房东B",new HouseInfo(500,30));
        l2.setMediator(mediator);
        l2.addHouse(new HouseInfo(800,50));
        l2.sendMsg(l2.getHouseInfoList().get(0));
        l2.sendMsg(l2.getHouseInfoList().get(1));

        Renter r1 = new Renter("租房者C");
        r1.setMediator(mediator);
        r1.sendMsg(new HouseInfo(500,30));


        Renter r2 = new Renter("租房者D");
        r2.setMediator(mediator);
        r2.sendMsg(new HouseInfo(600,40));


        l1.addHouse(new HouseInfo(600,40));

    }
}
