package builder.computer;

import builder.computer.part.cpu.AMDCPU;
import builder.computer.part.mainbroad.GaMainBoard;
import builder.computer.part.memory.KingstonMemory;

/**
 * 组装联想电脑
 * Created by misu on 2018/1/21.
 */
public class LenoveComputerBuilder extends ComputerBuilder {


    public LenoveComputerBuilder(String name) {
        computer = new Computer();
        computer.setName(name);
        System.out.println("组装"+name+"电脑：");
    }


    public void buildCPU() {
        computer.setCpu(new AMDCPU());
    }


    public void buildMemory() {
        computer.setMemory(new KingstonMemory());
    }

    public void buildMainBroad() {
        computer.setMainBroad(new GaMainBoard());
    }


    public Computer getComputer(){
        buildComputer();
        return computer;
    }




}
