package abstract_factory;

public abstract class TextField extends Component {
    public TextField(String text) {
        super(text);
    }
    public abstract void display();
}
