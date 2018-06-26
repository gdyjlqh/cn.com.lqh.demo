package builder.computer;

import builder.computer.part.cpu.CPU;
import builder.computer.part.mainbroad.MainBroad;
import builder.computer.part.memory.Memory;

/**
 * Created by misu on 2018/1/21.
 */
public class Computer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private CPU cpu;
    private Memory memory;
    private MainBroad mainBroad;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public MainBroad getMainBroad() {
        return mainBroad;
    }

    public void setMainBroad(MainBroad mainBroad) {
        this.mainBroad = mainBroad;
    }

    @Override
    public String toString() {
        return String.format(getName()+"电脑配置如下：CPU:%s,内存:%s,主板:%s",getCpu(),getMemory(),getMainBroad());
    }
}
