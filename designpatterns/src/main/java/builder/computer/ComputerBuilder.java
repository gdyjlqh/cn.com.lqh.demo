package builder.computer;

/**
 * 组装电脑
 * Created by misu on 2018/1/21.
 */
public abstract class ComputerBuilder {

    protected Computer computer = null;
    /**
     * 安装装cpu
     */
    public abstract void buildCPU();

    /**
     * 安装内存条
     */
    public abstract void buildMemory();


    /**
     * 安装主板
     */
    public abstract void buildMainBroad();

    /**
     * 组装电脑
     * @return
     */
    public void buildComputer(){
        buildCPU();
        System.out.println("安装CPU:"+computer.getCpu());
        buildMemory();
        System.out.println("安装内存:"+computer.getMemory());
        buildMainBroad();
        System.out.println("安装主板:"+computer.getMainBroad());

    }

    public abstract Computer getComputer();

}
