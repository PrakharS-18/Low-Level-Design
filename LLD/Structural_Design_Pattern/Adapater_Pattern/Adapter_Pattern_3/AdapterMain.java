package LLD.Structural_Design_Pattern.Adapater_Pattern.Adapter_Pattern_3;

public class AdapterMain {
    public static void main(String[] args) {
        LegacyUsbAPort usb = new LegacyUsbAPort("Music");
        usb.inputUsbAPort();
    }
}
