package chain;


/**
 * Created by misu on 2018/1/22.
 */
public abstract class Handler {

    private Handler nextHandler;
    private Level handlerLevel;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Level getHandlerLevel() {
        return handlerLevel;
    }

    public void setHandlerLevel(Level handlerLevel) {
        this.handlerLevel = handlerLevel;
    }

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    public final Response handlerMessage(Request request){
        Response response = null;
        if(levelPass(this.handlerLevel,request.getRequestLevel())){
            System.out.println("处理："+request.getRequest());
            response = this.echo(request);
            System.out.println(response);
        }else{
            System.out.println("没权限处理流程");
        }

        //next
        if(nextHandler != null){
            System.out.println("下一个流程");
            response = nextHandler.handlerMessage(request);
        }else{
            System.out.println("没有下一个流程结束");
        }
        return response;
    }

    public abstract chain.Response echo(Request request);

    /**
     * 子类可以继承，个性level判断
     * @param handlerLevel
     * @param requestLevel
     * @return
     */
    protected boolean levelPass(Level handlerLevel,Level requestLevel){
        return handlerLevel.getLevel()>requestLevel.getLevel();
    }
}
