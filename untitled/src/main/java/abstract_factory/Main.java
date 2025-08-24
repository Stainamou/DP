package abstract_factory;

public class Main {
    public static void main(String[] args) {
        UIFactory factoryA = new AFactory();
        UIFactory factoryB = new BFactory();

        Button buttonA = factoryA.createButton("Button A");
        TextField fieldA = factoryA.createTextField("TextField A");
        Checkbox checkboxA = factoryA.createCheckbox("Checkbox A");

        Button buttonB = factoryB.createButton("Button B");
        TextField fieldB = factoryB.createTextField("TextField B");
        Checkbox checkboxB = factoryB.createCheckbox("Checkbox B");

        buttonA.display();
        fieldA.display();
        checkboxA.display();

        buttonB.display();
        fieldB.display();
        checkboxB.display();
    }
}
