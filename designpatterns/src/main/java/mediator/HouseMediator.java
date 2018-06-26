package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misu on 2018/1/21.
 */
public class HouseMediator extends Mediator {
    public void broadMsg(Person person,HouseInfo houseInfo) {
        List<Person> persons = new ArrayList<Person>();

        int type = 0;
        if (person instanceof  Renter){
            //租房者求租，通知房东
            persons.addAll(getLandlords());

        }else if(person instanceof Landlord){
            //房东出租房子，通知租房者
            persons.addAll(getRenters());
            type = 1;
        }

        boolean exists = false;
        for (Person p:persons){
            HouseInfo house = p.getHouse(houseInfo);
             if(house != null){
                exists = true;
                p.getMsg(house.toString());
            }
        }

        if(exists == false){
            if(type == 0){
                System.out.println("<<没有符合要求的房子");
            }else{
                System.out.println("<<没有符合要求的租客");
            }
        }
    }


}
