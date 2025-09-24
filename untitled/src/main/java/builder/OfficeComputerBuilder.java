package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    @Override
    public void buildProcessor() {
        this.processor = "Intel Core i5";
    }

    @Override
    public void buildRAM() {
        this.ram = 16;
    }

    @Override
    public void buildHardDrive() {
        this.hardDrive = "512 GB SSD";
    }

    @Override
    public void buildGraphicsCard() {
        this.graphicsCard = "NVIDIA RTX 2080";
    }

    @Override
    public void buildOperatingSystem() {
        this.operatingSystem = "Windows 11 Pro";
    }

    public Computer getResult() {
        return new Computer(processor, ram, hardDrive, graphicsCard, operatingSystem);
    }
}
