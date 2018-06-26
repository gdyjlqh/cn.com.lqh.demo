package command;

/**
 * Created by misu on 2018/1/21.
 */
public abstract class Command {

    private Receiver reciever;

    public Receiver getReciever() {
        return reciever;
    }

    public void setReciever(Receiver reciever) {
        this.reciever = reciever;
    }

    public Command(Receiver reciever) {
        this.reciever = reciever;
    }

    public abstract void execute();
}
