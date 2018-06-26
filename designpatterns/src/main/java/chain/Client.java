package chain;

/**
 * Created by misu on 2018/1/22.
 */
public class Client {

    public static void main(String[] args) {


        Handler projectHandler = new ProjectManagerHandler();
        projectHandler.setHandlerLevel(new Level(10));
        Handler topHandler = new TopManagerHandler();
        topHandler.setHandlerLevel(new Level(20));
        Handler financialHandler = new FinancialHandler();
        financialHandler.setHandlerLevel(new Level(22));

        projectHandler.setNext(topHandler);
        topHandler.setNext(financialHandler);
        Response response = projectHandler.handlerMessage(new Request(new Level(8), "工时申请"));


        Response response2 = projectHandler.handlerMessage(new Request(new Level(10), "报销申请"));


    }
}
