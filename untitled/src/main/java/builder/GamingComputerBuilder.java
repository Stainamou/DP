package builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    @Override
    public void buildProcessor() {
        this.processor = "Intel Core i9";
    }

    @Override
    public void buildRAM() {
        this.ram = 32;
    }

    @Override
    public void buildHardDrive() {
        this.hardDrive = "2 TB SSD";
    }

    @Override
    public void buildGraphicsCard() {
        this.graphicsCard = "NVIDIA RTX 4090";
    }

    @Override
    public void buildOperatingSystem() {
        this.operatingSystem = "Windows 11 Home";
    }

    public Computer getResult() {
        return new Computer(processor, ram, hardDrive, graphicsCard, operatingSystem);
    }
}
