package LLD.MachineCodingExamples.ParkingLot;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NextAvailableAllocationStrategy implements SpotAllocatingStrategy{

    private final Lock lock = new ReentrantLock();

    /*
    race condition: two threads might at the same time check for a particular spot and thus may result in problem
    concurrency handling: using reentrant lock , use tryLock to implement the locking of thread unsafe portion
     */
    /**
     * Allocates a parking spot to the given vehicle in the specified parking area.
     * The allocation is done based on the next available spot that can fit the vehicle.
     * This method is thread-safe and will not allocate the same spot to multiple vehicles concurrently.
     *
     * @param vehicle the vehicle to be allocated a parking spot
     * @param parkingArea the parking area where the vehicle is to be parked
     * @return the allocated parking spot, or null if no spot is available
     */
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingArea parkingArea) {
        for (ParkingSpot parkingSpot: parkingArea.getParkingSpotList()) {
            if (lock.tryLock()) {
                try {
                    if (!parkingSpot.isOccupied() && parkingSpot.canFitVehicle(vehicle)) {
                        parkingSpot.setOccupied(true);
                        return parkingSpot;
                    }
                } finally {
                    lock.unlock(); /* lock should be unlocked otherwise another thread will never access this code */
                }
            }
        }
        return null;
    }

    /**
     * Deallocates the parking spot associated with the given ticket in the specified parking area.
     * The parking spot is marked as unoccupied, making it available for future allocations.
     * This method is thread-safe.
     *
     * @param ticket the ticket associated with the parking spot to be deallocated
     * @param parkingArea the parking area where the parking spot is located
     */
    @Override
    public void deallocateSpot(Ticket ticket, ParkingArea parkingArea) {
        for (ParkingSpot parkingSpot: parkingArea.getParkingSpotList()) {
            if (parkingSpot.isOccupied() && ticket.getParkingSpot().equals(parkingSpot)) {
                parkingSpot.setOccupied(false);
                return;
            }
        }
    }

}
