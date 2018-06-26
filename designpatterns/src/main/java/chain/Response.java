package chain;

/**
 * Created by misu on 2018/1/22.
 */
public class Response {

    private String result;
    private Handler handler;

    public Response(String result, Handler handler) {
        this.result = result;
        this.handler = handler;
    }

    public String getResult() {

        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String toString() {
        return getResult();
    }
}
