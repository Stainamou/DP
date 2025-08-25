package abstract_factory;

public abstract class Checkbox extends Component {
    public Checkbox(String text) {
        super(text);
    }
    public abstract void display();
}
