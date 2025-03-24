package LLD.Creational_Design_Pattern.Builder_Pattern;


/*
 * Here height, width, woodType are compulsory fields/requirements
 * Rest are optional
 * 
 * If we try to create a object , there will be alot of permutation and combination of parameteros of constructor
 * 
 * So to take away the creation of object from class itself, is what Builder Pattern is all about
 */
public class Wardrobe {
    int height;
    int width;
    boolean isMirror;
    boolean isWheel;
    String woodType;


    /* need to have a default constructor, you will know why in wardrobe builder class 
     * - also it can't be public , else it can easily be instantiated
    */
    Wardrobe(int h, int w, boolean isM, boolean isW, String wt) {
        height = h;
        width = w;
        this.isMirror = isM;
        isWheel = isW;
        woodType = wt;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getWoodType() {
        return woodType;
    }

    public boolean getisMirror() {
        return isMirror;
    }

    public boolean getisWheel() {
        return isWheel;
    }

}
