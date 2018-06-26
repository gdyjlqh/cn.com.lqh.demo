package chain;

/**
 * Created by misu on 2018/1/22.
 */
public class FinancialHandler extends Handler {
    public Response echo(Request request) {
        return new Response("财务部审批通过",this);
    }

}
