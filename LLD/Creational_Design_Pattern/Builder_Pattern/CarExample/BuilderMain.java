package LLD.Creational_Design_Pattern.Builder_Pattern.CarExample;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor("Black")
                .setCompany("RangeRover")
                .setModelName("SUVpXp")
                .setNumber(23523)
                .setPrice(1033453)
                .build();

        System.out.println(car.getModelName());
    }
}
