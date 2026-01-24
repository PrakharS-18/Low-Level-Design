package LLD.MachineCodingExamples.ParkingLot;

import java.time.Duration;

public class FixedHourlyRateStrategy implements FeeCalculationStrategy {

    private final ParkingRateConfig parkingRateConfig;

    public FixedHourlyRateStrategy(ParkingRateConfig parkingRateConfig) {
        this.parkingRateConfig = parkingRateConfig;
    }

    /**
     * Calculates the parking fee for a given ticket based on the fixed hourly rate
     * strategy.
     *
     * The fee is calculated by multiplying the hourly rate of the parking spot type
     * with the number of hours the vehicle was parked. The hourly rate is retrieved
     * from the {@link ParkingRateConfig} instance.
     *
     * @param ticket the ticket for which to calculate the fee
     * @return the calculated parking fee
     * @throws IllegalArgumentException if the exit time of the ticket is null
     */
    @Override
    public long calculateFee(Ticket ticket) {
        if(ticket.getExitTime()==null) {
            throw new IllegalArgumentException("Ticket exit time is null, please provide an exit time");
        }
        ParkingSpot parkingSpotAllotted = ticket.getParkingSpot();
        return parkingRateConfig.getHourlyRatesBySpot(parkingSpotAllotted.getParkingSpotType())*(Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours());
    }
}
