package LLD.Structural_Design_Pattern.Adapter_Design_2;

public class HighLevelCode {

    // No information how does it convert to byte Code, but the adapter solves it by not letting me dmastero anything

    //just request the adapter to talk to that other interface (contract) which works differently

    private final ICompilerAdapter iCompilerAdapter = new CompilerAdapterImpl(new ByteCode());

    void runCode(String fileType) {
        iCompilerAdapter.request(fileType);
    }
}
