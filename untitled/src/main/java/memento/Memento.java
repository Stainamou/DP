package memento;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private long timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.timestamp = System.currentTimeMillis();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public String getDescription() {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString = dateFormat.format(new java.util.Date(timestamp));
        return "Saved at: " + timeString +
                "ColorBox1: " + options[0] +
                ", ColorBox2: " + options[1] +
                ", ColorBox3: " + options[2] +
                ", CheckBox: " + isSelected;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }
}
