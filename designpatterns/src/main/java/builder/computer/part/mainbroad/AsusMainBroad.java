package builder.computer.part.mainbroad;

/**
 * Created by misu on 2018/1/21.
 */
public class AsusMainBroad extends MainBroad {
    public MainBroad getMainBroad() {
        return new AsusMainBroad();
    }

    @Override
    public String toString() {
        return "AsusMainBroad";
    }
}
