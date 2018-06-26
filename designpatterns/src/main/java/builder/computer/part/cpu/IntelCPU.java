package builder.computer.part.cpu;

/**
 * Created by misu on 2018/1/21.
 */
public class IntelCPU implements CPU {
    public CPU getCpu() {
        return new IntelCPU();
    }

    @Override
    public String toString() {
        return "IntelCPU";
    }
}
