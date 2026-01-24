package LLD.MachineCodingExamples.ParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class ParkingMain {
    public static void main(String[] args) {
        // Create a vehicle
        System.out.println("----------------------------------------------- Vehicle Creation -----------------------------------------------");
        Vehicle vehicle = new Vehicle("BMW", VehicleType.LARGE, "fskjbo-sdvs-111");
        System.out.println("Vehicle Details:");
        System.out.println("  - Type: " + vehicle.getVehicleType());
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // Define parking area and spots
        System.out.println("----------------------------------------------- Defining Parking Area and Spots -----------------------------------------------");
        List<ParkingSpot> parkingSpots = createParkingSpots();
        ParkingArea parkingArea = new ParkingArea(parkingSpots);
        System.out.println("Parking Area Created with " + parkingSpots.size() + " parking spots.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // Configure parking lot management
        System.out.println("----------------------------------------------- Configuring Parking Lot Management -----------------------------------------------");
        EnumMap<ParkingSpotType, Long> parkingSpotPricePerHourFixed = createParkingSpotPricePerHourFixed();
        ParkingLotManagement parkingLotManagement = new ParkingLotManagement(
                parkingArea,
                new NextAvailableAllocationStrategy(),
                new FixedHourlyRateStrategy(new ParkingRateConfig(parkingSpotPricePerHourFixed)),
                new TicketService());
        System.out.println("Parking Lot Management configured.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // Simulate vehicle entry and exit
        System.out.println("----------------------------------------------- Simulating Vehicle Entry and Exit -----------------------------------------------");
        parkingLotManagement.entryParkingLot(vehicle);
        printParkingSpotStatus(parkingSpots);

        parkingLotManagement.exitParkingLot(vehicle, LocalDateTime.now().plusHours(3));
        printParkingSpotStatus(parkingSpots);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    private static List<ParkingSpot> createParkingSpots() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot(ParkingSpotType.SMALL, 1, 1, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.SMALL, 1, 2, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.MEDIUM, 1, 3, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.MEDIUM, 1, 4, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.LARGE, 1, 5, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.LARGE, 1, 6, false));
        parkingSpots.add(new ParkingSpot(ParkingSpotType.LARGE, 2, 7, false));
        return parkingSpots;
    }

    private static EnumMap<ParkingSpotType, Long> createParkingSpotPricePerHourFixed() {
        EnumMap<ParkingSpotType, Long> parkingSpotPricePerHourFixed = new EnumMap<>(ParkingSpotType.class);
        parkingSpotPricePerHourFixed.put(ParkingSpotType.SMALL, 10L);
        parkingSpotPricePerHourFixed.put(ParkingSpotType.MEDIUM, 20L);
        parkingSpotPricePerHourFixed.put(ParkingSpotType.LARGE, 30L);
        return parkingSpotPricePerHourFixed;
    }

    private static void printParkingSpotStatus(List<ParkingSpot> parkingSpots) {
        System.out.println("----------------------------------------------- Parking Spot Status -----------------------------------------------");
        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println("Parking Spot ID: " + parkingSpot.getParkingSpotId());
            System.out.println("  - Occupied: " + parkingSpot.isOccupied());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
}
