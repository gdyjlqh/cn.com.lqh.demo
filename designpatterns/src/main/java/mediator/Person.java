package mediator;

/**
 * Created by misu on 2018/1/21.
 */
public abstract class Person {
    private String name;

    private Mediator mediator;

    public Person(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    public abstract void sendMsg(HouseInfo house);

    public abstract void getMsg(String msg);

    public abstract HouseInfo getHouse(HouseInfo houseInfo);
}
