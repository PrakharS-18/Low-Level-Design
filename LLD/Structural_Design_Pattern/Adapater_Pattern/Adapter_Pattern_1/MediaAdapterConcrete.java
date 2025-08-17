package LLD.Structural_Design_Pattern.Adapater_Pattern.Adapter_Pattern_1;

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
