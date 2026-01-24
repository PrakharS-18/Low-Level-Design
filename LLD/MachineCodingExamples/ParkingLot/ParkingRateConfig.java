package LLD.MachineCodingExamples.ParkingLot;

import java.util.Map;

public class ParkingRateConfig {
    private final Map<ParkingSpotType, Long> hourlyRates;

    public ParkingRateConfig(Map<ParkingSpotType, Long> hourlyRates) {
        this.hourlyRates = hourlyRates;
    }

    public Long getHourlyRatesBySpot(ParkingSpotType spotType) {
        return hourlyRates.get(spotType);
    }
}
