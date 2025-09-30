package bridge;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        if (device.isEnabled()) {
            System.out.println("Executing voice command: " + command);
        } else {
            System.out.println("Cannot use voice control. Device is off.");
        }
    }
}
