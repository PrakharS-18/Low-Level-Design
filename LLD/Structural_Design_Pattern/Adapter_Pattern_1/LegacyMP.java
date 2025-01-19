package LLD.Structural_Design_Pattern.Adapter_Pattern;

public class LegacyMP {
    IMediaAdapter iMediaAdapter = new MediaAdapterConcrete(new ModernMP());

    void playMusic(String musicName) {
        iMediaAdapter.request(musicName);

        System.out.println("Adapted Accordingly");
    }


}
