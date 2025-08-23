package abstract_factory;

public class TextFieldB extends TextField {
    private String text;

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Displaying TextField in style B");
    }
}
