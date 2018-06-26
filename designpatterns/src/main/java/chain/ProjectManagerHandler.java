package chain;


/**
 * Created by misu on 2018/1/22.
 */
public class ProjectManagerHandler extends Handler {
    public Response echo(Request request) {
        return new Response("项目经理审批通过",this);
    }

    @Override
    protected boolean levelPass(Level handlerLevel, Level requestLevel) {
//        if(requestLevel.getLevel()<10){
//            System.out.println("请求级别小于10都需要项目经理审批");
//            return true;
//        }else {
//            return super.levelPass(handlerLevel,requestLevel);
//        }
        return super.levelPass(handlerLevel,requestLevel);
    }
}
