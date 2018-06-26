package command;

/**
 * Created by misu on 2018/1/21.
 */
public class CodeCommand extends Command {
    public CodeCommand(Receiver reciever) {
        super(reciever);
    }

    public void execute() {
        System.out.println("Command:execute");
        getReciever().action();
    }
}
