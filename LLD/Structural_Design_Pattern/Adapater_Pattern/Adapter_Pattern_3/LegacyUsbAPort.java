package LLD.Structural_Design_Pattern.Adapater_Pattern.Adapter_Pattern_3;

public class LegacyUsbAPort {
    PortAdapter portAdapter = new PortCAdapterConcrete(new TargetCPort());

    private String input;

    public LegacyUsbAPort(String input) {
        this.input = input;
    }

    void inputUsbAPort() {
        System.out.println(input +  " is in A format");
        portAdapter.requestPortChange(input);
    }
}
