package LLD.Creational_Design_Pattern.Builder_Pattern.WardRobe;

public class BuilderMain {
    public static void main(String[] args) {
        /* 
            Lets try to build a car Wardrobe with woodType = neem
         * isMirror  = yes
         * isWheel = no update
         * height = 5
         * width = 6
         */

         Wardrobe wb = new WardrobeBuilder()
                                .height(5)
                                .width(6)
                                .isMirror(true)
                                .woodType("Neem")
                                .build();

        System.out.println(wb.getHeight() + " "+ wb.getWidth() + " "+ wb.getWoodType());

        System.out.println(wb.isWheel);
    }
}
