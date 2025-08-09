package LLD.Creational_Design_Pattern.Builder_Pattern.CarExample;

public class Car {
    /* required fields for Car */
    private int number;
    private int price;
    private String company;
    private String modelName;

    /* not mandatory */
    private boolean isRoofTop;

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isRoofTop() {
        return isRoofTop;
    }

    public String getColor() {
        return color;
    }

    private String color;
    Car(int number, int price, String company, String modelName, boolean isRoofTop, String color) {
        this.number = number;
        this.price = price;
        this.company = company;
        this.modelName = modelName;
        this.isRoofTop = isRoofTop;
        this.color = color;
    }
}
