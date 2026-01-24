package LLD.MachineCodingExamples.ParkingLot;

public class Vehicle {

    private String brand;
    private VehicleType vehicleType;
    private String vehicleNumber;

    public Vehicle(String brand, VehicleType vehicleType, String vehicleNumber) {
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

}
