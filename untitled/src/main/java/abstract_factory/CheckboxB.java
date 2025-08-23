package abstract_factory;

public class CheckboxB extends Checkbox {
    private String text;

    public CheckboxB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Displaying Checkbox in style B");
    }
}
