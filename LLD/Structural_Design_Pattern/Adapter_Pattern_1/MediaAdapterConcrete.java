package LLD.Structural_Design_Pattern.Adapter_Pattern;

public class MediaAdapterConcrete  implements IMediaAdapter{

    private ModernMP modernMP;

    public MediaAdapterConcrete(ModernMP modernMP) {
        this.modernMP = modernMP;
    }

    @Override
    public void request(String musicName) {
        this.modernMP.playSong(musicName);
    }
}
