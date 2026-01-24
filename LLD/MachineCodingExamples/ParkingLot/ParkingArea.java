package LLD.MachineCodingExamples.ParkingLot;

import java.util.List;

public class ParkingArea {

    private List<ParkingSpot> parkingSpotList;

    public ParkingArea(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
