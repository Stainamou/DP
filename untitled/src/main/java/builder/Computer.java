package builder;

public class Computer {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public Computer(String processor, int ram, String hardDrive, String graphicsCard, String operatingSystem) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRAM() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hard drive='" + hardDrive + '\'' +
                ", graphics card='" + graphicsCard + '\'' +
                ", operating system='" + operatingSystem + '\'' +
                '}';
    }
}
