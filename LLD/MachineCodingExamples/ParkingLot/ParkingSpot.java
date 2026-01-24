package LLD.MachineCodingExamples.ParkingLot;

public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private int parkingSpotId;
    private int parkingFloorId;

    public ParkingSpot(ParkingSpotType parkingSpotType, int parkingFloorId, int parkingSpotId) {
        this.parkingSpotType = parkingSpotType;
        this.parkingFloorId = parkingFloorId;
        this.parkingSpotId = parkingSpotId;
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
