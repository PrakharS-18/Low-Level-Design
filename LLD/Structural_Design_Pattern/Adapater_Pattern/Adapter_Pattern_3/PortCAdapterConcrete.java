package LLD.Structural_Design_Pattern.Adapater_Pattern.Adapter_Pattern_3;

public class PortCAdapterConcrete implements PortAdapter{

    private TargetCPort targetCPort;

    public PortCAdapterConcrete(TargetCPort targetCPort) {
        this.targetCPort = targetCPort;
    }

    @Override
    public void requestPortChange(String input) {
        System.out.println("ADAPTED ACCORDINGLY for input: " + input);
        targetCPort.inputViaCPort(input);
    }
}
