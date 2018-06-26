package builder.computer.part.mainbroad;

/**
 * Created by misu on 2018/1/21.
 */
public class GaMainBoard extends MainBroad {
    public MainBroad getMainBroad() {
        return new GaMainBoard();
    }

    @Override
    public String toString() {
        return "GaMainBoard";
    }
}
