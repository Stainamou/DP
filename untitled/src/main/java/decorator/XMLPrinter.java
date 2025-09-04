package decorator;

public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        String newText = "<message>\n" + text + "\n</message>";
        printer.print(newText);
    }
}
