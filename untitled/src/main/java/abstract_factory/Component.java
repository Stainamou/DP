package abstract_factory;

public abstract class Component {
    protected String text;

    public Component(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract void display();
}
