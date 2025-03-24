package LLD.Creational_Design_Pattern.Builder_Pattern;

public class WardrobeBuilder {
    private int height;
    private int width;
    private boolean isMirror;
    private boolean isWheel;
    private String woodType;

    public WardrobeBuilder height(int height) {
        this.height = height;
        return this; /* method chaining --> need to return current object or objects that support further calls */
    }

    public WardrobeBuilder width(int width) {
        this.width = width;
        return this;
    }

    public WardrobeBuilder isMirror(boolean isMirror) {
        this.isMirror = isMirror;
        return this;
    }

    public WardrobeBuilder isWheel(boolean isWheel) {
        this.isWheel = isWheel;
        return this;
    }

    public WardrobeBuilder woodType(String woodType) {
        this.woodType = woodType;
        return this;
    }

    public Wardrobe build() {
        return new Wardrobe(height, width, isMirror, isWheel, woodType);
    }
}
