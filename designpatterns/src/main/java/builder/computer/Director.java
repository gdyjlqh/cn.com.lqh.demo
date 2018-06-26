package builder.computer;

/**
 * 导演(导购员)
 * Created by misu on 2018/1/21.
 */
public class Director {
    private ComputerBuilder computerBuilder;

    public Director(String sign) {
        this.computerBuilder = ComputerBuilderFactory.builderComputer(sign);

    }

    /**
     *
     * @return
     */
    public Computer construct(){
        return computerBuilder.getComputer();
    }
}
