package builder.computer.part.cpu;

/**
 * Created by misu on 2018/1/21.
 */
public class AMDCPU implements CPU {
    public CPU getCpu() {
        return new AMDCPU();
    }

    @Override
    public String toString() {
        return "AMDCPU";
    }
}
