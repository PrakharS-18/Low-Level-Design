package LLD.Structural_Design_Pattern.Adapter_Design_2;

public class ByteCode {

    public void compileCode(String fileType) {

        System.out.println("The code is compiled! the file compiled can be downloaded as: " + fileType + ".byteCode");
    }
}
