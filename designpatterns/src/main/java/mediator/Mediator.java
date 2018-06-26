package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misu on 2018/1/21.
 */
public abstract class Mediator {


    private List<Person> renters = new ArrayList<Person>();

    public List<Person> getRenters() {
        return renters;
    }

    public void setRenters(List<Person> renters) {
        this.renters = renters;
    }

    public List<Person> getLandlords() {
        return landlords;
    }

    public void setLandlords(List<Person> landlords) {
        this.landlords = landlords;
    }

    private List<Person> landlords  = new ArrayList<Person>();

    public void register(Person person){
        if (person instanceof Renter){
            renters.add(person);
        }else if(person instanceof Landlord){
            landlords.add(person);
        }
    }

      public abstract void broadMsg(Person person,HouseInfo house);


}
