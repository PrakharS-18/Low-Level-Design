package LLD.Creational_Design_Pattern.Builder_Pattern.CarExample;

public class CarBuilder {
    /* required fields for Car */
    private int number;
    private int price;
    private String company;
    private String modelName;

    /* not mandatory */
    private boolean isRoofTop;
    private String color;

    public CarBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public CarBuilder setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public CarBuilder setRoofTop(boolean roofTop) {
        isRoofTop = roofTop;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(number,price,company,modelName,isRoofTop, color);
    }
}
