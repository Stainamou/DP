package bridge;

public class Main {
    public static void main(String[] args) {
        Device smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);

        smartTV.enable();
        smartRemote.voiceControl("Increase volume");
        smartRemote.volumeUp();
        smartRemote.channelUp();
        ((SmartTV) smartTV).browseInternet();
        smartTV.printStatus();

        smartTV.disable();
        smartRemote.voiceControl("Turn off");
    }
}
