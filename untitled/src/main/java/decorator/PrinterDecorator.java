package decorator;

public abstract class PrinterDecorator extends Printer {
    protected Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}
