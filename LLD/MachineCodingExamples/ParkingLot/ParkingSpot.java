package LLD.MachineCodingExamples.ParkingLot;

import java.util.Objects;

public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private int parkingSpotId;
    private int parkingFloorId;
    private boolean isOccupied;


    public ParkingSpot(ParkingSpotType parkingSpotType, int parkingFloorId, int parkingSpotId, boolean isOccupied) {
        this.parkingSpotType = parkingSpotType;
        this.parkingFloorId = parkingFloorId;
        this.parkingSpotId = parkingSpotId;
        this.isOccupied = isOccupied;
    }
    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    boolean canFitVehicle(Vehicle vehicle) {
        return Objects.equals(vehicle.getVehicleType().getValue(), (parkingSpotType.getValue()));
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(int parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }

}
