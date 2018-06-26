package command;

/**
 * Created by misu on 2018/1/21.
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("Invoker:action");
        this.command.execute();
    }
}
