package decorator;

public class BasicPrinter extends Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
