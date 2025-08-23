package abstract_factory;

public class CheckboxA extends Checkbox{
    private String text;

    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Displaying Checkbox in style A");
    }
}
