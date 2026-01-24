package LLD.MachineCodingExamples.ParkingLot;

public interface SpotAllocatingStrategy {

    ParkingSpot allocateSpot(Vehicle vehicle, ParkingArea parkingArea);

    void deallocateSpot(Ticket ticket, ParkingArea parkingArea);
}
