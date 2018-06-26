package chain;

/**
 * Created by misu on 2018/1/22.
 */
public class TopManagerHandler extends Handler {
    public Response echo(Request request) {
        return new Response("总经理审批",this);
    }
}
