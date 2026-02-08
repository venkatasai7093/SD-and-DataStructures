package StructuralDPs;

public class Computerfacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computerfacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start(){
        cpu.freeze();
        String data = hardDrive.read(0,10);
        memory.load(0 ,data);
        cpu.jump(0);
        cpu.execute();
    }
}
