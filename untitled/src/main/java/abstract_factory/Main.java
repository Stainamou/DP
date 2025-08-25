package abstract_factory;

public class Main {
    public static void main(String[] args) {
        UIFactory factoryA = new AFactory();
        UIFactory factoryB = new BFactory();

        Button buttonA = factoryA.createButton("Button A");
        TextField fieldA = factoryA.createTextField("TextField A");
        Checkbox checkboxA = factoryA.createCheckbox("Checkbox A");

        Button buttonB = factoryB.createButton("Click me");
        TextField fieldB = factoryB.createTextField("Push me");
        Checkbox checkboxB = factoryB.createCheckbox("Check me");

        buttonA.display();
        fieldA.display();
        checkboxA.display();

        buttonB.display();
        fieldB.display();
        checkboxB.display();

        buttonA.setText("Updated button A");
        fieldA.setText("Updated TextField A");
        checkboxA.setText("Updated Checkbox A");

        buttonB.setText("Don't click me");
        fieldB.setText("Don't push me");
        checkboxB.setText("Don't check me");

        System.out.println("\nAfter updating texts\n");
        buttonA.display();
        fieldA.display();
        checkboxA.display();

        buttonB.display();
        fieldB.display();
        checkboxB.display();
    }
}
