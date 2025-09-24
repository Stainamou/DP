package builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerBuilder builder2 = new OfficeComputerBuilder();

        ComputerDirector director = new ComputerDirector(builder);
        ComputerDirector director2 = new ComputerDirector(builder2);

        director.constructComputer();
        director2.constructComputer();

        Computer gamingPC = builder.getResult();
        Computer officePC = builder2.getResult();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
