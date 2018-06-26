package chain;

/**
 * Created by misu on 2018/1/22.
 */
public class Request {

    private Level requestLevel;
    private String request;

    public Request(Level requestLevel, String request) {
        this.requestLevel = requestLevel;
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Level getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(Level requestLevel) {
        this.requestLevel = requestLevel;
    }
}
