package builder.computer.part.memory;

/**
 * Created by misu on 2018/1/21.
 */
public class KingstonMemory implements Memory {
    public Memory getMemory() {
        return new KingstonMemory();
    }

    @Override
    public String toString() {
        return "KingstonMemery";
    }
}
