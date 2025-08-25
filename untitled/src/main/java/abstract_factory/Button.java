package abstract_factory;

public abstract class Button extends Component {
    public Button(String text) {
        super(text);
    }
    public abstract void display();
}
