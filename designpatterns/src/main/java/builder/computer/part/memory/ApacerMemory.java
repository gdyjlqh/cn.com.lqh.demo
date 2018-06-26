package builder.computer.part.memory;

/**
 * Created by misu on 2018/1/21.
 */
public class ApacerMemory implements Memory {

    public Memory getMemory() {
        return new ApacerMemory();
    }

    @Override
    public String toString() {
        return "ApacerMemory";
    }
}
