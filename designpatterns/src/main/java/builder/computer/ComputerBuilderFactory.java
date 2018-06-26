package builder.computer;

/**
 * Created by misu on 2018/1/21.
 */
public class ComputerBuilderFactory {

    public static ComputerBuilder builderComputer(String sign){
        if("lenove".equalsIgnoreCase(sign)){
            return new LenoveComputerBuilder(sign);
        }
        return null;
    }
}
