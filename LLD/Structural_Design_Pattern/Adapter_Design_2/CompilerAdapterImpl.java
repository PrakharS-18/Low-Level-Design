package LLD.Structural_Design_Pattern.Adapter_Design_2;

/*
* Actual implementation lies here ---> where this adapter takes the input from interface1 and  communicate with
* interface2 and revert to interface1
*
* */
public class CompilerAdapterImpl implements ICompilerAdapter{

    private final ByteCode byteCode;

    public CompilerAdapterImpl(ByteCode byteCode) {
        this.byteCode = byteCode;
    }

    @Override
    public void request(String fileType) {
        byteCode.compileCode(fileType);
    }
}
