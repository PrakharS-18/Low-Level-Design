package LLD.MachineCodingExamples.ParkingLot;

import java.time.LocalDateTime;

public class ParkingLotManagement {

    private final ParkingArea parkingArea;
    private final SpotAllocatingStrategy spotAllocatingStrategy;
    private final FeeCalculationStrategy feeCalculationStrategy;
    private final TicketService ticketService;


    public ParkingLotManagement(ParkingArea parkingArea, SpotAllocatingStrategy spotAllocatingStrategy, FeeCalculationStrategy feeCalculationStrategy,
                                TicketService ticketService) {
        this.parkingArea = parkingArea;
        this.spotAllocatingStrategy = spotAllocatingStrategy;
        this.feeCalculationStrategy = feeCalculationStrategy;
        this.ticketService = ticketService;
    }

    /**
     * Handles the entry of a vehicle into the parking lot. This method performs the following operations:
     * <ul>
     *     <li>Allocates a parking spot based on the vehicle's type and the chosen allocation strategy.</li>
     *     <li>Generates a ticket for the vehicle based on the allocated parking spot and the current entry time.</li>
     *     <li>Prints the generated ticket.</li>
     * </ul>
     * If a parking spot cannot be allocated, an {@link UnsupportedOperationException} is thrown.
     *
     * @param vehicle the vehicle entering the parking lot
     * @throws UnsupportedOperationException if a parking spot cannot be allocated
     */
    void entryParkingLot(Vehicle vehicle) {
        /*
         inside parking lot, there has to be 2 things on higher level -> entry and exit and then we will go from top to bottom till ticket generation
         While entering:
            - allocateSpot based on its type from parking area and chosen strategy for allocation
            - generate ticket based on entry time
         */
        ParkingSpot allocatedParkingSpot = spotAllocatingStrategy.allocateSpot(vehicle, parkingArea);
        if (allocatedParkingSpot == null) {
            throw new UnsupportedOperationException("Spot not allocated, either filled or not available");
        }
        Ticket ticketGenerated = ticketService.generateTicket(allocatedParkingSpot, vehicle);
        ticketService.printTicket(ticketGenerated);
    }

    /**
     * Handles the exit of a vehicle from the parking lot. This method performs the following operations:
     * <ul>
     *     <li>Retrieves the ticket associated with the vehicle based on its vehicle number.</li>
     *     <li>Sets the exit time of the ticket to the provided time.</li>
     *     <li>Deallocates the parking spot associated with the ticket based on the chosen deallocation strategy.</li>
     *     <li>Calculates and prints the parking fee based on the ticket and the chosen fee calculation strategy.</li>
     * </ul>
     * If the ticket is not found, a {@link NullPointerException} may be thrown when attempting to access the ticket.
     *
     * @param vehicle the vehicle exiting the parking lot
     * @param time the time at which the vehicle is exiting the parking lot
     */
    void exitParkingLot(Vehicle vehicle, LocalDateTime time) {
        Ticket ticket = ticketService.getTicketByVehicleNumber(vehicle.getVehicleNumber());
        ticket.setExitTime(time);
        spotAllocatingStrategy.deallocateSpot(ticket, parkingArea);
        System.out.println("Parking fee-"+ feeCalculationStrategy.calculateFee(ticket));
    }

}
