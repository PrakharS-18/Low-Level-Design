package LLD.SOLID.DependencyInversion;

/* This is a high level module */
public class DIPService {

    /* this could be done with depedency injectiopn */
    DIPRepo dipRepo = new DIPRepo(); 
    public void saveDIP() {
        dipRepo.save(); /* using low-level module dependenc */
    }


    /* depends upon DIPRepoValid not directly to DIPRepoImp */
    private static DIPRepoValid dipRepoValid;

    public void saveDIPCorrect() {
        dipRepoValid.save();
    }
}
